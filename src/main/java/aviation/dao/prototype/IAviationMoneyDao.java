package aviation.dao.prototype;

import aviation.entity.po.AviationModel;
import aviation.entity.po.AviationMoney;
/*
 * 价格表实现接口
 * 
 * */
public interface IAviationMoneyDao {
	//--查询价钱
	AviationMoney chess(int ModelId);
	//--查询全部的价格
	
//--更新和修改价钱	
	void ChageMoney(AviationMoney ModelId);
//--删除价钱
	int daleteMoney(int id );
}
