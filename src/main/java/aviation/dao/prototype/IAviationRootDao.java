package aviation.dao.prototype;

import aviation.entity.po.AviationRoot;


public interface IAviationRootDao {	
	// - 查询管理员用户
	AviationRoot findRoot(int rootId);
}
