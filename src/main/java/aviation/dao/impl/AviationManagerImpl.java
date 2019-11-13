package aviation.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationManagerDao;
import aviation.entity.po.AviationManager;
import aviation.entity.po.AviationModel;

/*
 * 经理表的实现类
 * 
 * */
@Repository("aviationManagerImpl")
public class AviationManagerImpl implements IAviationManagerDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	//--根据id查询经理
	@Override
	public AviationManager find(int Id) {
		
		return jdbcTemplate.queryForObject("select * from aviation_manager where manager_id=?",
				new Object[] {(Id)},
				new BeanPropertyRowMapper<>(AviationManager.class));
	}
//--查询所有经理
	@Override
	public List<AviationManager> findAll() {
		List<AviationManager> lists = jdbcTemplate.query("select * from aviation_manager", new BeanPropertyRowMapper<AviationManager>(AviationManager.class));
		return lists;
	}
//--更新和修改经理表
	@Override
	public void updateManager(AviationManager ManagerId) {
		if(ManagerId.getManagerId()==0) {
			jdbcTemplate.update(
					"insert into aviation_manager(manager_name,manager_sex,manager_tel,manager_pwd)value(?,?,?,?)",
					new Object[] {ManagerId.getManagerName(),ManagerId.getManagerSex(),ManagerId.getManagerTel(),ManagerId.getManagerPwd()}
					);
		}else {
			jdbcTemplate.update("update aviation_manager set manager_name=?,manager_sex=?,manager_tel=?,manager_pwd=? where manager_id=?",
					new Object[] {ManagerId.getManagerName(),ManagerId.getManagerSex(),ManagerId.getManagerTel(),ManagerId.getManagerPwd(),ManagerId.getManagerId()}
					);
			
			
			
			
		}	
	}
//--删除经理表
	@Override
	public int deleteManager(int id) {
		
		return jdbcTemplate.update("delete from aviation_manager where manager_id =?",
				new Object[] {id}
				);
	}
	@Override
	public int findMaxId() {
		
		AviationManager am = jdbcTemplate.queryForObject("select manager_id from aviation_manager order by manager_id desc limit 1",
				new BeanPropertyRowMapper<AviationManager>(AviationManager.class));
		return am.getManagerId();
	}

}
