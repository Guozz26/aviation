package aviation.dao.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationSalesmanDao;
import aviation.entity.po.AviationSalesman;
import aviation.entity.po.AviationUser;

/**
 * 营业员的dao层的接口实现类
 * @author 卟嗳
 *
 */
@Repository("aviationSalesmanDaoImpl")
public class AviationSalesmanDaoImpl implements IAviationSalesmanDao {
	 @Autowired
	 private JdbcTemplate jdbcTemplate;
	 @Override
	//营业员的单个查找
	 public AviationSalesman findOne(int salesmanId) {
		return jdbcTemplate.queryForObject(
				"select * from aviation_salesman where salesman_id=?",  
				new Object[] {(salesmanId)},
				new BeanPropertyRowMapper<>(AviationSalesman.class));
			};
	//营业员的单个删除
	@Override
	public int deleteOne(int salesmanId) {
		return jdbcTemplate.update(
				"delete from aviation_salesman where salesman_id=?",
				new Object[] {(salesmanId)});
	}
	//营业员的修改和插入
	@Override
	public int saveOrUpdataOne(AviationSalesman salesmanId) {
		int b=0;
		if(salesmanId.getSalesmanId()==0){
			b=jdbcTemplate.update("insert into aviation_salesman(salesman_name,"
					+ "salesman_sex,salesman_age,salesman_pwd,point_id) "
					+ "values(?,?,?,?,?)", 
					new Object[]{salesmanId.getSalesmanName(),salesmanId.getSalesmanSex(),
							salesmanId.getSalesmanAge(),salesmanId.getSalesmanPwd(),salesmanId.getPointId()});
					
		}else{
			b=jdbcTemplate.update(
					"update aviation_salesman set salesman_name=?,salesman_sex=?,salesman_age=?,salesman_pwd=?,"
					+ "point_id=? where salesman_id=?", 
					new Object[]{salesmanId.getSalesmanName(),salesmanId.getSalesmanSex(),
							salesmanId.getSalesmanAge(),salesmanId.getSalesmanPwd(),
							salesmanId.getPointId(),salesmanId.getSalesmanId()});
		}
		return b;
		
	}
	//营业员的多个查找
	@Override
	public List<AviationSalesman> findAll(int offset, int pageSize) {
		return jdbcTemplate.query(
				"select * from aviation_salesman limit ?,?", 
				new Object[]{offset,pageSize}, 
				new BeanPropertyRowMapper<>(AviationSalesman.class));
	}

	@Override
	public int totalItems() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//通过用户名和密码查找用户
	@Override
	public AviationSalesman fingsaesman(String name, String password) {
	
		return  jdbcTemplate.queryForObject("select * from aviation_salesman where salesman_name = ? and salesman_pwd = ?",
				new Object[] {name,password},
				new BeanPropertyRowMapper<AviationSalesman>(AviationSalesman.class)
				);
	}
}