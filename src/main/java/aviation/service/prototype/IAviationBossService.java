package aviation.service.prototype;

import aviation.entity.po.AviationBoss;

public interface IAviationBossService {
	//根据用户和密码查找
		AviationBoss  fingBoss(String name,String password);

}
