package aviation.dao.prototype;

import java.util.List;

import aviation.entity.po.AviationOrder;
import aviation.entity.vo.OrderInfo;
/*
 * 
 * 订单管理的实体类
 * 
 * */
public interface IAviationOrderDao {
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
	//根据用户名查询id
/*		OrderInfo ordername( String name);*/
	//退票状态
	int tuipoa(int OrderId ,int statics);
	
	//根据名字查订单
	List<AviationOrder> usernaem(String name);
		//更新订单
	AviationOrder changes(int OrderId);
}
