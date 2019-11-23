package aviation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aviation.dao.prototype.IAviationBossDao;
import aviation.entity.po.AviationBoss;
import aviation.service.prototype.IAviationBossService;

@Service("aviationBossServiceImpl")
public class AviationBossServiceImpl  implements IAviationBossService{
	@Autowired
	private IAviationBossDao  iaviarionBossDao;
	//--根据用户名和密码登录
	@Override
	public AviationBoss fingBoss(String name, String password) {
		// TODO Auto-generated method stub
		return iaviarionBossDao.fingBoss(name, password);
	}


	
}
