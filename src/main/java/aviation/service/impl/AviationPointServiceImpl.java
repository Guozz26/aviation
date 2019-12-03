package aviation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aviation.dao.prototype.IAviationPointDao;
import aviation.entity.po.AviationPoint;
import aviation.service.prototype.IAviationPointService;
/**
 * service层营业点实现类
 * @author 卟嗳
 *
 */
@Service("aviationPointServiceImpl")
public class AviationPointServiceImpl implements IAviationPointService {
	  @Autowired
      private IAviationPointDao aviationdao;
	  //营业点单个查找实现类
	@Override
	public AviationPoint findOne(int id) {
		// TODO Auto-generated method stub
		return aviationdao.findOne(id);
	}
	//营业点的查找所有实现类
	@Override
	public List<AviationPoint> listfindAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return aviationdao.findAll((pageNo-1)*pageSize,pageSize);
	}
	//营业点的单个删除实现类
	@Override
	public int deleteOne(int id) {
		
		return aviationdao.deleteOne(id);
	}
	//营业点的单个插入和修改实现类
	@Override
	public int ServicesaveOrUpdataOne(AviationPoint pointId) {

		// TODO Auto-generated method stub
	  return aviationdao.saveOrUpdataOne(pointId);
	
	}

}
