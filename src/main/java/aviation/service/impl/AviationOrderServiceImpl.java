package aviation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aviation.dao.prototype.IAviationOrderDao;
import aviation.entity.po.AviationOrder;
import aviation.entity.vo.OrderInfo;
import aviation.service.prototype.IAviationOrderService;

/*
 * 订单管理业务实现类
 * 
 * */
@Service("aviationOrdreServiceImpl")
public class AviationOrderServiceImpl  implements IAviationOrderService{
	@Autowired
	private IAviationOrderDao aviationOrderDao;
	
	
	
	
	
//--查询一个订单
	public AviationOrder chess(int OrderId) {
		
		return aviationOrderDao.chess(OrderId);
	}

//--根据用户id查询

	public List<OrderInfo> userss(int UserId) {
		
		return aviationOrderDao.userss(UserId);
	}
//--查询订单多个

	public List<AviationOrder> check(int pageNo, int pageSize) {
	
		return aviationOrderDao.check((pageNo-1)*pageSize, pageSize);
	}
//--查询订单所有信息

	public OrderInfo findFlightInfoAll(int id) {
		
		return aviationOrderDao.findFlightInfoAll(id);
	}
	
//--修改订单

	public void ChageOrder(AviationOrder OrderId) {
		
		aviationOrderDao.ChageOrder(OrderId);
		
	}
	
//--删除订单

	public int daleteOrder(int id) {
		
		return aviationOrderDao.daleteOrder(id);
	}


	

}
