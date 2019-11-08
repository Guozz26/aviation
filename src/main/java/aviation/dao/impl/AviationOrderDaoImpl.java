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
	public OrderInfo userss(int UserId) {
		
		return jdbcTemplate.queryForObject("SELECT b.user_name  ,a.order_id,a.order_idcard,a.order_time,c.flight_id,c.flight_from_time,c.flight_from,c.flight_to_time,c.flight_to,d.model_name\r\n" + 
				",e.price_name,g.total_price\r\n" + 
				"FROM aviation_order a \r\n" + 
				"LEFT JOIN aviation_user b on  a.user_id = b.user_id\r\n" + 
				"LEFT JOIN aviation_total  g ON a.total_id = a.total_id\r\n" + 
				"LEFT JOIN aviation_flight  c on c.flight_id = g.flight_id\r\n" + 
				"LEFT JOIN aviation_model d ON d.model_id = d.model_id\r\n" + 
				"LEFT JOIN aviation_price e ON g.price_id = e.price_id\r\n" + 
				"WHERE b.user_id = ?", 
				new Object[] {(UserId)},
				new BeanPropertyRowMapper<OrderInfo>(OrderInfo.class)
				);
		
	}

	//--查询用户买过 的票
	@Override
	public OrderInfo findFlightInfoAll(int id) {
		return jdbcTemplate.queryForObject("SELECT b.user_name  ,a.order_id,a.order_idcard,a.order_time,c.flight_id,c.flight_from_time,c.flight_from,c.flight_to_time,c.flight_to,d.model_name\r\n" + 
				",e.price_name,g.total_price\r\n" + 
				"FROM aviation_order a \r\n" + 
				"LEFT JOIN aviation_user b on  a.user_id = b.user_id\r\n" + 
				"LEFT JOIN aviation_total  g ON a.total_id = a.total_id\r\n" + 
				"LEFT JOIN aviation_flight  c on c.flight_id = g.flight_id\r\n" + 
				"LEFT JOIN aviation_model d ON d.model_id = d.model_id\r\n" + 
				"LEFT JOIN aviation_price e ON g.price_id = e.price_id\r\n" + 
				"WHERE order_id = ?", 
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
					"insert into aviation_order(order_name,order_idcard,order_time,money_id,flight_id,user_id,price_id,total_id) values(?,?,?,?,?,?,?,?)", 
					new Object[]{OrderId.getOrderName(),OrderId.getOrderIdcard(),OrderId.getOrderTime(),OrderId.getMoneyId(),OrderId.getFlightId(),OrderId.getUserId(),OrderId.getPriceId(),OrderId.getTotalId()});
		}else {
			jdbcTemplate.update(
					"update aviation_order set order_name=?,order_idcard=?,order_time=?,money_id=?,flight_id=?,user_id=?,price_id=?,total_id=? where order_id=? ", 
					new Object[]{OrderId.getOrderName(),OrderId.getOrderIdcard(),OrderId.getOrderTime(),OrderId.getMoneyId(),OrderId.getFlightId(),OrderId.getUserId(),OrderId.getPriceId(),OrderId.getTotalId(),OrderId.getOrderId()});
		}
	
	}
				
//--删除订单
	@Override
	public int daleteOrder(int id) {
		
		return jdbcTemplate.update("delete from aviation_order where order_id=?", new Object[]{id});
	}



	
}
