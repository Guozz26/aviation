package aviation.testService.Aviationpoint;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.entity.po.AviationPoint;
import aviation.service.prototype.IAviationPointService;
import aviation.util.Pager;





@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
public class testAviationPointServiceImpl {
	@Autowired
	private IAviationPointService actService;
	//查找单个营业点
	@Test	
	public void testSearchAccount(){
		System.out.println(actService.findOne(1));
	}
	@Test
	public void test01(){
		List<AviationPoint> pager = actService.listPaged(1, 3);
		for (AviationPoint act : pager) {
			System.out.println(act);
		}
	
	}
	
}