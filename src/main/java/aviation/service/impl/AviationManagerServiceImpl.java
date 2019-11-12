package aviation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aviation.dao.prototype.IAviationManagerDao;
import aviation.entity.po.AviationManager;
import aviation.service.prototype.IAviationManagerService;

@Service("aviationManagerServiceImpl")
public class AviationManagerServiceImpl implements IAviationManagerService{
	@Autowired
	private IAviationManagerDao iaviationMnagerDao;
	
	//--查询一个经理
	@Override
	public AviationManager find(int Id) {
		
		return iaviationMnagerDao.find(Id);
	}
//--查询所有经理
	@Override
	public List<AviationManager> findAll() {
		
		return iaviationMnagerDao.findAll();
	}

	//--修改和更新经理信息
	@Override
	public void updateManager(AviationManager ManagerId) {
		iaviationMnagerDao.updateManager(ManagerId);
		
	}
//--删除经理
	@Override
	public int deleteManager(int id) {
		
		return iaviationMnagerDao.deleteManager(id);
	}
	@Override
	public int findMaxId() {
		
		return iaviationMnagerDao.findMaxId();
	}

}
