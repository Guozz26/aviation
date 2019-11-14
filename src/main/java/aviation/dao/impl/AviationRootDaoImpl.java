package aviation.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationRootDao;
import aviation.entity.po.AviationRoot;

@Repository("aviationRootDaoImpl")
public class AviationRootDaoImpl implements IAviationRootDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public AviationRoot findRoot(int rootId) {
		AviationRoot aviationRoot = jdbcTemplate.queryForObject("select * from aviation_root where root_id = ?", 
				new Object[] {rootId},
				new BeanPropertyRowMapper<AviationRoot>(AviationRoot.class));
		return aviationRoot;
	}

	@Override
	public AviationRoot findRoot(String name, String password) {
		return jdbcTemplate.queryForObject("select * from aviation_root where root_name = ? and root_pwd=?", 
				new Object[] {name,password},
				new BeanPropertyRowMapper<AviationRoot>(AviationRoot.class));
	}
	
	
}
