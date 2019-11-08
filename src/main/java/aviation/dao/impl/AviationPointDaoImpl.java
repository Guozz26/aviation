package aviation.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationPointDao;
import aviation.entity.po.AviationPoint;

/**
 * 营业点实现类
 * @author 卟嗳
 *
 */

@Repository("aviationPointDaoImpl")
public class AviationPointDaoImpl implements IAviationPointDao{
	 @Autowired
	private  JdbcTemplate  jdbcTemplate;
	 //寻找单个营业点的一条信息
	 @Override
	public AviationPoint findOne(int pointId) {
		
		return jdbcTemplate.queryForObject(
				"select * from aviation_point where point_id=?",  
				new Object[] {(pointId)},
				new BeanPropertyRowMapper<>(AviationPoint.class));
	}
	 //删除单个营业点的一条信息
	 @Override
	public void deleteOne(int pointId) {
		jdbcTemplate.update("delete from aviation_point where point_id=?", new Object[]{pointId});
	}
	//插入和更新一个营业点的信息
	 @Override
	public void saveOrUpdataOne(AviationPoint pointId) {
		
		if(pointId.getPointId()==0){
			jdbcTemplate.update(
					"insert into aviation_point(point_city,manager_id) values(?,?)", 
					new Object[]{pointId.getPointCity(),pointId.getManagerId()});
		}else{
			jdbcTemplate.update(
					"update aviation_point set point_city=?,manager_id=? where point_id=?", 
					new Object[]{pointId.getPointCity(),pointId.getManagerId(),pointId.getPointId()});
		}
	}
    //查询所有的营业点的信息
	@Override
	public List<AviationPoint> findAll(int offset, int pageSize) {
		return jdbcTemplate.query(
				"select * from aviation_point limit ?,?", 
				new Object[]{offset,pageSize}, 
				new BeanPropertyRowMapper<>(AviationPoint.class));
	}
	//获取总条数
	@Override
	public int totalItems() {
		// TODO Auto-generated method stub
		return 0;
	}
}
