package aviation.dao.prototype;

import aviation.entity.po.AviationBoss;

/*
 * 老板实现登录
 * 
 * */
public interface IAviationBossDao {
	//根据用户和密码查找
	AviationBoss  fingBoss(String name,String password);

}
