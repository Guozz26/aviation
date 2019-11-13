package aviation.service.prototype;

import java.util.List;

import aviation.entity.po.AviationUser;

public interface IAviationUserService {
	//--根据id查用户
	AviationUser find(int Id);
	//--查询全部用户
	List<AviationUser> findAll();
	//修改和更新用户
	void updateUser(AviationUser UserId);
	//--删除用户
	int deleteUser (int id);
	// - 根据用户名和密码查找用户
	AviationUser findUser(String name,String password);
	
	
}
