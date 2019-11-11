package aviation.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationUserDao;
import aviation.entity.po.AviationManager;
import aviation.entity.po.AviationUser;

@Repository("aviationUserDaoImpl")
public class AviationUserDaoImpl implements IAviationUserDao{

	@Autowired
	private JdbcTemplate jdbctemplate;
//--查询单个用户
	@Override
	public AviationUser find(int Id) {
		
		return jdbctemplate.queryForObject("select * from aviation_User where User_id=?",
				new Object[] {(Id)},
				new BeanPropertyRowMapper<>(AviationUser.class));
	}
//--查询所有 用户
	@Override
	public List<AviationUser> findAll() {
	List<AviationUser> ss = jdbctemplate.query("select * from aviation_User",
			new BeanPropertyRowMapper<AviationUser>(AviationUser.class)
			);
		return ss;
	}
//--更新 和修改用户
	@Override
	public void updateUser(AviationUser UserId) {
		if(UserId.getUserId()==0) {
			jdbctemplate.update(
					"insert into aviation_user(user_name,user_pwd,user_sex,user_age)value(?,?,?,?)",
					new Object[] {UserId.getUserName(),UserId.getUserPwd(),UserId.getUserSex(),UserId.getUserAge()}
					);
		}else {
			jdbctemplate.update("update aviation_user set user_name=?,user_pwd=?,user_sex=?,user_age=? where user_id=?",
					new Object[] {UserId.getUserName(),UserId.getUserPwd(),UserId.getUserSex(),UserId.getUserAge(),UserId.getUserId()}
					);	
		}	
		
	}
//--删除
	@Override
	public int deleteUser(int id) {
	
		return jdbctemplate.update("delete from aviation_user where user_id=?",new Object[] {id});
	}
	
	
}
