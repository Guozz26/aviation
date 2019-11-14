package aviation.dao.prototype;

import aviation.entity.po.AviationRoot;


public interface IAviationRootDao {	
	// - 查询管理员用户
	AviationRoot findRoot(int rootId);
	//- 根据密码和用户名查找
	AviationRoot findRoot(String name,String password);
}
