package aviation.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationOrderDao;
import aviation.entity.po.AviationOrder;
import aviation.entity.vo.OrderInfo;
/*
 * 订单管理的实现类
 * 
 * */
@Repository("aviationOrderDaoImpl")
public class AviationOrderDaoImpl implements IAviationOrderDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//查询一个订单
	@Override
	public AviationOrder chess(int OrderId) {
		
		return jdbcTemplate.queryForObject("select * from aviation_order where order_id=?", 
				new Object[] {(OrderId)},
				new BeanPropertyRowMapper<>(AviationOrder.class)
				);
	}
	
	//根据用户查订单
	@Override
	public List<OrderInfo> userss(int UserId) {
		
		return jdbcTemplate.query("select b.order_id,b.order_name,b.order_idcard ,"
				+ "b.order_time,a.user_name,a.user_age,c.flight_from,c.flight_from_time,"
				+ "c.flight_to,c.flight_to_time,d.money_body_price,d.money_head_price from aviation_user a	"
				+ "lEFT JOIN aviation_order b on a.user_id = b.user_id "
				+ "left join aviation_flight c on b.flight_id = c.flight_id "
				+ "left join aviation_money d on b.money_id = d.money_id "
				+ "WHERE a.user_id = ?",
				new Object[] {UserId}, new BeanPropertyRowMapper<OrderInfo>(OrderInfo.class));
		
	}

	//--查询某个订单的详细信息
	@Override
	public OrderInfo findFlightInfoAll(int id) {
		return jdbcTemplate.queryForObject("select a.order_id,a.order_name,a.order_idcard ,a.order_time,b.user_name,b.user_age,c.flight_from,c.flight_from_time,c.flight_to,"
				+ "c.flight_to_time,d.money_body_price,d.money_head_price "
				+ "from aviation_order 	a "
				+ "lEFT JOIN aviation_user b on a.user_id = b.user_id "
				+ "left join aviation_flight c on a.flight_id = c.flight_id  "
				+ "left join aviation_money d on a.money_id = d.money_id " 
				+ "WHERE order_id = ?", 
				new Object[] {id}, new BeanPropertyRowMapper<OrderInfo>(OrderInfo.class));
	}
//--查询多个订单
	@Override
	public List<AviationOrder> check(int offset, int pageSize) {
		
		return jdbcTemplate.query(
				"select * from  aviation_order limit ?,?", 
				new Object[]{offset,pageSize}, 
				new BeanPropertyRowMapper<>(AviationOrder.class));
	}
//--修改订单  根据 始发地 到达地   时间 和插入
	@Override
	public void ChageOrder(AviationOrder OrderId) {
		if(OrderId.getOrderId()==0) {
			jdbcTemplate.update(
					"insert into aviation_order(order_name,order_idcard,order_time,money_id,flight_id,user_id,price_id) values(?,?,?,?,?,?,?)", 
					new Object[]{OrderId.getOrderName(),OrderId.getOrderIdcard(),OrderId.getOrderTime(),OrderId.getMoneyId(),OrderId.getFlightId(),OrderId.getUserId(),OrderId.getPriceId()});
		}else {
			jdbcTemplate.update(
					"update aviation_order set order_name=?,order_idcard=?,order_time=?,money_id=?,flight_id=?,user_id=?,price_id=?,total_id=? where order_id=? ", 
					new Object[]{OrderId.getOrderName(),OrderId.getOrderIdcard(),OrderId.getOrderTime(),OrderId.getMoneyId(),OrderId.getFlightId(),OrderId.getUserId(),OrderId.getPriceId(),OrderId.getOrderId()});
		}
	
	}
				
//--删除订单
	@Override
	public int daleteOrder(int id) {
		
		return jdbcTemplate.update("delete from aviation_order where order_id=?", new Object[]{id});
	}



	
}
