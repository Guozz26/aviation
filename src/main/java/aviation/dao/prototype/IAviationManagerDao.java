package aviation.dao.prototype;

import java.util.List;

import aviation.entity.po.AviationManager;

/*
 * 经理表的接口
 * 
 * */
public interface IAviationManagerDao {
	
	//--根据id查询经理
	AviationManager find(int Id);
	//--查询全部经理
	List<AviationManager> findAll();
	//修改和更新经理
	void updateManager(AviationManager ManagerId);
	//--删除经理
	int deleteManager (int id);
	   // -查询当前最大的营业点的编号值
	   int findMaxId();
}
