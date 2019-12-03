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
	
		return jdbcTemplate.queryForObject("select*from aviation_order where order_id=?", 
				new Object[] {(OrderId)},
				new BeanPropertyRowMapper<AviationOrder>(AviationOrder.class));
	}
	
	//--根据用户 、身份证查询
	@Override
	public List<AviationOrder> userss(String name ,String idcard) {
		return jdbcTemplate.query("select * from aviation_order where order_idcard=? and order_user_name=?",
				new Object[]{name,idcard},
				new BeanPropertyRowMapper<AviationOrder>(AviationOrder.class)
				);
	}
	//--查询所有订单
	@Override
	public List<AviationOrder> findFlightInfoAll() {
	
		return jdbcTemplate.query("select * from aviation_order ",
				new BeanPropertyRowMapper<AviationOrder>(AviationOrder.class)
				);
		
	}
	//--修改订单
	@Override
	public int ChageOrder(AviationOrder OrderId) {
		int i = 0;
		if(OrderId.getOrderId()==0) {
			i=jdbcTemplate.update(
					"insert into aviation_order (order_idcard,order_money,order_from_time,order_from_to,order_times,order_to,order_user_name,order_price,user_id,order_static)values(?,?,?,?,?,?,?,?,?,?)",
					new Object[]{OrderId.getOrderIdcard(),OrderId.getOrderMoney(),OrderId.getOrderFromTime(),OrderId.getOrderFromTo(),OrderId.getOrderTimes(),OrderId.getOrderTo(), OrderId.getOrderUserName(),OrderId.getOrderPrice(),OrderId.getUserId(),OrderId.getOrderStatic()}
				
					);
		}else {
			i=jdbcTemplate.update("update aviation_order set order_idcard=?,order_money=?,order_from_time=?,order_from_to=?,order_times=?,order_to=?,order_user_name=?,order_price=?,order_static=?  where order_id=? ",
					new Object[] {OrderId.getOrderIdcard(),OrderId.getOrderMoney(),OrderId.getOrderFromTime(),OrderId.getOrderFromTo(),OrderId.getOrderTimes(),OrderId.getOrderTo(),OrderId.getOrderUserName(),OrderId.getOrderPrice(),OrderId.getOrderStatic(),OrderId.getOrderId()}
					
					);	
		}
		return i;
		
	}	
	//--删除订单
	@Override
	public int daleteOrder(int id) {
		
		return jdbcTemplate.update("delete from aviation_order where order_id=?", new Object[]{id});
	}

	//根据用户id查订单
	@Override
	public List<AviationOrder> user(int UserId) {
		
		return jdbcTemplate.query("SELECT a.order_times ,a.order_to,a.order_from_time,a.order_from_to,a.order_price ,a.order_money FROM aviation_order  a\r\n" + 
				"LEFT JOIN  aviation_user b  on  a.user_id = b.user_id\r\n" + 
				"WHERE a.user_id= ?;", new Object[] {UserId},
				new BeanPropertyRowMapper<AviationOrder>(AviationOrder.class)
				);
	}
	//根据状态退票

	@Override
	public int tuipoa(int OrderId, int statics) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("UPDATE aviation_order SET  order_static=? WHERE order_id = ?",
				new Object[]{statics,OrderId}

				);
	}

	//根据名字查订单
	@Override
	public List<AviationOrder> usernaem(String name) {
	
		return jdbcTemplate.query("select * from aviation_order where  order_user_name=?",
				new Object[]{name},
				new BeanPropertyRowMapper<AviationOrder>(AviationOrder.class)
				);
	}
//更新

	@Override
	public AviationOrder changes(int OrderId) {
	
		
		return null;
	}

	
//	//根据用户名查询id
//	@Override
//	public OrderInfo ordername(String name) {
//		
//		return jdbcTemplate.queryForObject("SELECT b.user_id FROM aviation_order a \r\n" + 
//				"LEFT JOIN aviation_user b \r\n" + 
//				"on b.user_name= a.order_user_name\r\n" + 
//				"WHERE a.order_user_name =?;", 
//				new Object[] {name},
//				new BeanPropertyRowMapper<OrderInfo>(OrderInfo.class));
//	}



	
}
