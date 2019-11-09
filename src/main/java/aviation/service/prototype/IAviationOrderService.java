package aviation.service.prototype;

import java.util.List;

import aviation.entity.po.AviationOrder;
import aviation.entity.po.AviationPoint;
import aviation.entity.vo.OrderInfo;

/*
 * 订单业务实现接口
 * 
 * 
 * */
public interface IAviationOrderService {
	//--查询一个订单
		AviationOrder chess(int OrderId);
		//--根据用户id查询
		OrderInfo userss(int UserId);
		//--查询订单多个
		List<AviationOrder> check (int offset,int pageSize);
		
		//--查询订单所有信息
		  OrderInfo findFlightInfoAll(int id);
		
		//--修改订单
		void ChageOrder(AviationOrder OrderId);
		//--删除订单
		int daleteOrder(int id );
	
}
