package aviation.testDao.AviationOrder;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.dao.prototype.IAviationOrderDao;
import aviation.entity.po.AviationMoney;
import aviation.entity.po.AviationOrder;
import aviation.entity.po.AviationSalesman;
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
	//--根据用户 和身份正证号查询
	@Test
	public void usetTet() {
		List<AviationOrder> ss  = aviationOrderDao.userss("123456","张三");
		
		System.out.println(ss);
		
	}
	@Test
	public void findllTest() {
		List<AviationOrder> aa  =  aviationOrderDao.findFlightInfoAll();
		for (AviationOrder aviationOrder : aa) {
			  System.out.println(aviationOrder);
		}


    	  }
    	  
 //更新和插入     
	@Test
	public void updataTest() {
		 
	    	AviationOrder man = new AviationOrder(15,"123456",135.0, 
	        	DateUtil.toDate("yyyy-MM-dd hh:mm:ss","1997-01-08 23:03:20"),DateUtil.toDate("yyyy-MM-dd hh:mm:ss",  "1997-02-08 23:03:20"),"北京","上海","李四","头等舱");
	    	System.out.println(aviationOrderDao.ChageOrder(man));
	}
	
	//--删除订单
	@Test
	public void testdelet() {
		aviationOrderDao.daleteOrder(15);
		
	}
	
	//根据用户id查订单
	
	@Test
	public void user() {
		List<AviationOrder> ss = aviationOrderDao.user(1);
		for (AviationOrder aviationOrder : ss) {
			System.out.println(aviationOrder);
		}
		
		
	}
/*	@Test
	public void  orderdaos() {
		OrderInfo ao = aviationOrderDao.ordername("李四");
		System.out.println(ao);

	}*/
	
	/*
	/*
	//--测试 订单查询
	@Test
	public void testFindAllOrderInfo() {
		OrderInfo lists  = aviationOrderDao.findFlightInfoAll(1);
		
		System.out.println(lists);
		
	}
	
	
	//--测试订单插入
	@Test
	public void Testfes() {
		 AviationOrder  se = new AviationOrder(1,"1224564df",120.0,DateUtil.toDate("yyyy-MM-dd hh:mm:ss", "1997-06-13 23:12:12"),DateUtil.toDate("yyyy-MM-dd hh:mm:ss", "1997-06-13 23:12:12"),"北京","上海","张三");
		 aviationOrderDao.ChageOrder(se);
	}
	*/

	
	}
	
	

