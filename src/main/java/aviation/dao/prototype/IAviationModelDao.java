package aviation.dao.prototype;

import aviation.entity.po.AviationModel;
import aviation.entity.po.AviationOrder;

/*
 * 机型表的实现接口
 * 
 * */
public interface IAviationModelDao {
	//--查询机型
		AviationModel chess(int ModelId);
	//--更新和修改机型	
		void ChageModel(AviationModel ModelId);
	//--删除机型
		int daleteModel(int id );
}
