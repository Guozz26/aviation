package aviation.testDao.AviationOrder;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.dao.prototype.IAviationOrderDao;
import aviation.entity.po.AviationOrder;
import aviation.entity.vo.OrderInfo;
import aviation.util.DateUtil;

/*
 * 订单管理Dao层测试类
 * 
 * 
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationOrderImpl {

	@Autowired
	private IAviationOrderDao  aviationOrderDao;
		//--查询一个	
	@Test
		public void  orderdao() {
			AviationOrder ao = aviationOrderDao.chess(1);
			System.out.println(ao);
	
		}
		//--查询多个
	
	@Test
		public void orderss(){
		 List<AviationOrder> pages = aviationOrderDao.check(0, 5);
		 	for (AviationOrder aviationOrder : pages) {
		 		
		 			System.out.println(aviationOrder);
			}
	}
	//--根据用户查询
	@Test
	public void usetTet() {
		OrderInfo ss  = aviationOrderDao.userss(1);
		
		System.out.println(ss);
		
		
	}
	
	
	//--测试 订单查询
	@Test
	public void testFindAllOrderInfo() {
		OrderInfo lists  = aviationOrderDao.findFlightInfoAll(1);
		
		System.out.println(lists);
		
	}
	
	
	//--测试订单插入
	@Test
	public void Testfes() {
		 AviationOrder  se = new AviationOrder(1,"tr","s12123",DateUtil.toDate("yyyy-MM-dd hh:mm:ss", "1997-06-12 23:12:12"),2,2,3,4,2);
		 aviationOrderDao.ChageOrder(se);
	}
	//--删除订单
	@Test
	public void testdelet() {
		aviationOrderDao.daleteOrder(3);
		
		
	}
	
	}
	

