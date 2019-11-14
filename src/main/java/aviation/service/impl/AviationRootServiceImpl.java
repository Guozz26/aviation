package aviation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aviation.dao.prototype.IAviationRootDao;
import aviation.entity.po.AviationRoot;
import aviation.service.prototype.IAviationRootService;

@Service
public class AviationRootServiceImpl implements IAviationRootService{
	
	@Autowired
	private IAviationRootDao rootDao;

	@Override
	public AviationRoot find(String name, String password) {
		return rootDao.findRoot(name, password);
	}
}
