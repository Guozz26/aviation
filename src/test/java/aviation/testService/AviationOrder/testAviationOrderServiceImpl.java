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
	
	@Test
	public void  orderdao() {
		AviationOrder ao = iaviationorderservice.chess(1);
		System.out.println(ao);

	}
//--根据用户 和身份正证号查询
@Test
public void usetTet() {
	List<AviationOrder> ss  = iaviationorderservice.userss("李四","123456");
	
	System.out.println(ss);
	
}
@Test
public void findllTest() {
	List<AviationOrder> aa  = iaviationorderservice.findFlightInfoAll();

	  for (AviationOrder aviationOrder : aa) {
		  System.out.println(aviationOrder);
	}
	
	  }
	  
//更新和插入     
@Test
public void updataTest() {
	 
    	AviationOrder man = new AviationOrder(16,"123456",135.0, 
        	DateUtil.toDate("yyyy-MM-dd hh:mm:ss","1997-01-08 23:03:20"),DateUtil.toDate("yyyy-MM-dd hh:mm:ss",  "1997-02-08 23:03:20"),"北京","上海","李四","经济舱");
    	System.out.println(iaviationorderservice.ChageOrder(man));
}

//--删除订单
@Test
public void testdelet() {
	iaviationorderservice.daleteOrder(8);
	
}

@Test
public void testf() {
	iaviationorderservice.tuipoa(2, 0);
	
}

}
