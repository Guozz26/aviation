package aviation.service.prototype;

import java.util.List;

import aviation.entity.po.AviationPoint;
import aviation.util.MiniPager;

/**
 * 营业点Service层接口
 * @author 卟嗳
 *
 */

public interface IAviationPointService {
	//-- 查询飞机点
	
	AviationPoint findOne(int pointId);
	//-- 分页查询飞机点		
	List<AviationPoint> listAccounts(int pageNo, int pageSize);
	
	List<AviationPoint> listPaged(int pageNo, int pageSize);
}
