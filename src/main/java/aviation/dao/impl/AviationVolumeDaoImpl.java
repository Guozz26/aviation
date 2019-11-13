package aviation.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationVolumeDao;
import aviation.entity.vo.VolumeInfo;
import aviation.util.DateUtil;

@Repository
public class AviationVolumeDaoImpl  implements IAviationVolumeDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override	// -查询某营业点的盈利信息
	public List<VolumeInfo> selectPointVolume(int pointId, Date orderDate,int num) {
		if(num==1) {
		return jdbcTemplate.query("SELECT money_body_price, money_head_price,d.price_id, a.point_id,e.point_city FROM "  
				+ "aviation_volume a " 
				+ "LEFT JOIN aviation_order b ON a.order_id = b.order_id "  
				+ "left JOIN aviation_money c on c.money_id = b.money_id "  
				+ "left JOIN aviation_price d on d.price_id = b.price_id "
				+ "left join aviation_point e on a.point_id = e.point_id "  
				+ "WHERE a.point_id =? and b.order_time like '%"+DateUtil.dateToString("yyyy-MM-dd", orderDate)+"%' ", new Object[] {pointId},
				new BeanPropertyRowMapper<VolumeInfo>(VolumeInfo.class)
				);
		}else if(num == 2) {
			return jdbcTemplate.query("SELECT money_body_price, money_head_price,d.price_id ,a.point_id,e.point_city FROM "  
					+ "aviation_volume a " 
					+ "LEFT JOIN aviation_order b ON a.order_id = b.order_id "  
					+ "left JOIN aviation_money c on c.money_id = b.money_id "  
					+ "left JOIN aviation_price d on d.price_id = b.price_id "
					+ "left join aviation_point e on a.point_id = e.point_id "  
					+ "WHERE a.point_id =? and b.order_time like '%"+DateUtil.dateToString("yyyy-MM", orderDate)+"%' ", new Object[] {pointId},
					new BeanPropertyRowMapper<VolumeInfo>(VolumeInfo.class)
					);
		}else {
			return jdbcTemplate.query("SELECT money_body_price, money_head_price,d.price_id ,a.point_id,e.point_city FROM "  
					+ "aviation_volume a " 
					+ "LEFT JOIN aviation_order b ON a.order_id = b.order_id "  
					+ "left JOIN aviation_money c on c.money_id = b.money_id "  
					+ "left JOIN aviation_price d on d.price_id = b.price_id "
					+ "left join aviation_point e on a.point_id = e.point_id "  
					+ "WHERE a.point_id =? and b.order_time like '%"+DateUtil.dateToString("yyyy", orderDate)+"%' ", new Object[] {pointId},
					new BeanPropertyRowMapper<VolumeInfo>(VolumeInfo.class)
					);
		}
	}
	@Override
	public List<VolumeInfo> selectSalesman(int salesmanId, Date orderDate,int num) {
		if(num==1) {
			return jdbcTemplate.query("SELECT money_body_price, money_head_price,d.price_id ,a.point_id,e.salesman_name FROM "  
					+ "aviation_volume a " 
					+ "LEFT JOIN aviation_order b ON a.order_id = b.order_id "  
					+ "left JOIN aviation_money c on c.money_id = b.money_id "  
					+ "left JOIN aviation_price d on d.price_id = b.price_id "
					+ "left join aviation_salesman e on a.salesman_id = e.salesman_id "  
					+ "WHERE a.salesman_id =? and b.order_time like '%"+DateUtil.dateToString("yyyy-MM-dd", orderDate)+"%' ", new Object[] {salesmanId},
					new BeanPropertyRowMapper<VolumeInfo>(VolumeInfo.class)
					);
		}else if(num==2) {
			return jdbcTemplate.query("SELECT money_body_price, money_head_price,d.price_id ,a.point_id,e.salesman_name FROM "  
					+ "aviation_volume a " 
					+ "LEFT JOIN aviation_order b ON a.order_id = b.order_id "  
					+ "left JOIN aviation_money c on c.money_id = b.money_id "  
					+ "left JOIN aviation_price d on d.price_id = b.price_id "
					+ "left join aviation_salesman e on a.salesman_id = e.salesman_id " 
					+ "WHERE a.salesman_id =? and b.order_time like '%"+DateUtil.dateToString("yyyy-MM", orderDate)+"%' ", new Object[] {salesmanId},
					new BeanPropertyRowMapper<VolumeInfo>(VolumeInfo.class)
					);
		}else {
			return jdbcTemplate.query("SELECT money_body_price, money_head_price,d.price_id ,a.point_id,e.salesman_name FROM "  
					+ "aviation_volume a " 
					+ "LEFT JOIN aviation_order b ON a.order_id = b.order_id "  
					+ "left JOIN aviation_money c on c.money_id = b.money_id "  
					+ "left JOIN aviation_price d on d.price_id = b.price_id "
					+ "left join aviation_salesman e on a.salesman_id = e.salesman_id " 
					+ "WHERE a.salesman_id =? and b.order_time like '%"+DateUtil.dateToString("yyyy", orderDate)+"%' ", new Object[] {salesmanId},
					new BeanPropertyRowMapper<VolumeInfo>(VolumeInfo.class)
					);
		}
	}
	@Override
	public List<VolumeInfo> selectVolume(Date orderTime, int num) {
		if(num==1) {
			return jdbcTemplate.query("SELECT money_body_price, money_head_price,d.price_id FROM "  
					+ "aviation_volume a " 
					+ "LEFT JOIN aviation_order b ON a.order_id = b.order_id "  
					+ "left JOIN aviation_money c on c.money_id = b.money_id "  
					+ "left JOIN aviation_price d on d.price_id = b.price_id "  
					+ "WHERE b.order_time like '%"+DateUtil.dateToString("yyyy-MM-dd", orderTime)+"%' ", new Object[] {},
					new BeanPropertyRowMapper<VolumeInfo>(VolumeInfo.class)
					);
		}else if(num==2) {
			return jdbcTemplate.query("SELECT money_body_price, money_head_price,d.price_id  FROM "  
					+ "aviation_volume a " 
					+ "LEFT JOIN aviation_order b ON a.order_id = b.order_id "  
					+ "left JOIN aviation_money c on c.money_id = b.money_id "  
					+ "left JOIN aviation_price d on d.price_id = b.price_id "  
					+ "WHERE b.order_time like '%"+DateUtil.dateToString("yyyy-MM", orderTime)+"%' ", new Object[] {},
					new BeanPropertyRowMapper<VolumeInfo>(VolumeInfo.class)
					);
		}else {
			return jdbcTemplate.query("SELECT money_body_price, money_head_price,d.price_id FROM "  
					+ "aviation_volume a " 
					+ "LEFT JOIN aviation_order b ON a.order_id = b.order_id "  
					+ "left JOIN aviation_money c on c.money_id = b.money_id "  
					+ "left JOIN aviation_price d on d.price_id = b.price_id "  
					+ "WHERE b.order_time like '%"+DateUtil.dateToString("yyyy-MM-dd", orderTime)+"%' ", new Object[] {},
					new BeanPropertyRowMapper<VolumeInfo>(VolumeInfo.class)
					);
		}
	}
	
}
