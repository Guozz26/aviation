package aviation.testService.AviationOrder;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.entity.po.AviationOrder;
import aviation.entity.vo.OrderInfo;
import aviation.service.prototype.IAviationOrderService;
import aviation.util.DateUtil;

/*
 * 
 * 订单管理  service测试实现类
 * 
 * 
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
public class testAviationOrderServiceImpl {
	
	@Autowired
	private IAviationOrderService iaviationorderservice;
	
	//--查询一个	
	@Test
		public void  orderdao() {
			AviationOrder ao = iaviationorderservice.chess(1);
			System.out.println(ao);
	
		}
	//--查询多个
	
@Test
	public void orderss(){
	 List<AviationOrder> pages = iaviationorderservice.check(0, 100);
	 	for (AviationOrder aviationOrder : pages) {
	 		
	 			System.out.println(aviationOrder);
		}
}



//--根据用户查询
	@Test
	public void usetTet() {
		List<OrderInfo> ss  = iaviationorderservice.userss(1);
		
		System.out.println(ss);
	}
	//--测试 订单查询
	@Test
	public void testFindAllOrderInfo() {
		OrderInfo lists  = iaviationorderservice.findFlightInfoAll(1);
		
		System.out.println(lists);
		
	}
	
	//--测试订单插入
		@Test
		public void Testfes() {
			 AviationOrder  se = new AviationOrder( "tt","s12123",DateUtil.toDate("yyyy-MM-dd hh:mm:ss", "1997-06-13 23:12:12"),3,4,5,5);
			 iaviationorderservice.ChageOrder(se);
		}
	
		//--删除订单
		@Test
		public void testdelet() {
			iaviationorderservice.daleteOrder(4);
			
			
		}
}
