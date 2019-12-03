package aviation.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationBossDao;
import aviation.entity.po.AviationBoss;

/*
 * bossdao层实现方法
 * 
 * */
@Repository("aviationBossDaoImpl")
public class AviationBossDaoImpl implements IAviationBossDao{
	@Autowired
	private  JdbcTemplate jdbcTemplate;
	
	//通过用户名和密码查找用户
	@Override
	public AviationBoss fingBoss(String name, String password) {
		
		
		return  jdbcTemplate.queryForObject("select * from aviation_boss where boss_name = ? and boss_pwd = ?",
				new Object[] {name,password},
				new BeanPropertyRowMapper<AviationBoss>(AviationBoss.class)
				);
	}

}
