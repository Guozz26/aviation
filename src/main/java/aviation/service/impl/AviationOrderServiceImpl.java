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
	
	@Override
	public AviationOrder chess(int OrderId) {
		
		return aviationOrderDao.chess(OrderId);
	}
	
	

	@Override
	public List<AviationOrder> userss(String name, String idcard) {
		// TODO Auto-generated method stub
		return aviationOrderDao.userss(name, idcard);
	}

	@Override
	public List<AviationOrder> findFlightInfoAll() {
		// TODO Auto-generated method stub
		return aviationOrderDao.findFlightInfoAll();
	}

	@Override
	public int ChageOrder(AviationOrder OrderId) {
		
		return aviationOrderDao.ChageOrder(OrderId);
		
	}

	@Override
	public int daleteOrder(int id) {
		// TODO Auto-generated method stub
		return aviationOrderDao.daleteOrder(id);
	}



	@Override
	public List<AviationOrder> user(int UserId) {
		// TODO Auto-generated method stub
		return aviationOrderDao.user(UserId);
	}



	@Override
	public int tuipoa(int OrderId, int statics) {
		
		return aviationOrderDao.tuipoa(OrderId, statics);
	}



	@Override
	public List<AviationOrder> usernaem(String name) {
	
		return aviationOrderDao.usernaem(name);
	}


//更新
	@Override
	public AviationOrder changes(int OrderId) {
		// TODO Auto-generated method stub
	 
	return aviationOrderDao.changes(OrderId);
	}
	
	
	
	
	

	

}
