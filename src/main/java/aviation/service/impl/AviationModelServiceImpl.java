package aviation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aviation.dao.prototype.IAviationModelDao;
import aviation.entity.po.AviationModel;
import aviation.service.prototype.IAviationModelService;
@Service("aviationModelServiceImpl")
public class AviationModelServiceImpl implements IAviationModelService{

	@Autowired
	private  IAviationModelDao iaviationModelDao;
	//--查询机型
	@Override
	public AviationModel chess(int ModelId) {
		
		return iaviationModelDao.chess(ModelId);
	}
	//--更新和修改机型	
	@Override
	public void ChageModel(AviationModel ModelId) {
		iaviationModelDao.ChageModel(ModelId);
		
	}
	//--删除机型
	@Override
	public int daleteModel(int id) {
		
		return iaviationModelDao.daleteModel(id);
	}
	// -查询所有的机型
	@Override
	public List<AviationModel> findAll() {
		
		return iaviationModelDao.findAll();
	}
	
}
