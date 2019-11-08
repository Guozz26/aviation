package aviation.service.prototype;

import java.util.List;

import aviation.entity.po.AviationPoint;

/**
 * 营业点Service层接口
 * @author 卟嗳
 *
 */

public interface IAviationPointService {
	//-- 查询飞机点	
	AviationPoint findOne(int pointId);
	
	//查询所有营业点
	List<AviationPoint> listfindAll(int pageNo, int pageSize);
	//--删除单个营业点
	int deleteOne(int id);
	//--营业点的修改和插入
	int  ServicesaveOrUpdataOne(AviationPoint pointId);
}
