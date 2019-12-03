package aviation.service.prototype;

import java.util.List;

import aviation.entity.po.AviationOrder;

/*
 * 订单业务实现接口
 * 
 * 
 * */
public interface IAviationOrderService {
	//--查询一个订单
	AviationOrder chess(int OrderId);
	//--根据用户 和身份证查询
	List<AviationOrder> userss(String name ,String idcard);
	//--查询订单所有信息
	List<AviationOrder> findFlightInfoAll();
	//--修改订单
	int ChageOrder(AviationOrder OrderId);
	//--删除订单
	int daleteOrder(int id );
/*	//查询最后一条的订单
	AviationOrder chesses();*/
	//--根据用户id查询
	List<AviationOrder> user(int UserId);
	//退票
	int tuipoa(int OrderId ,int statics);
	//根据名字查订单
	List<AviationOrder> usernaem(String name);
	//更新订单
	AviationOrder changes(int OrderId);
	
}
