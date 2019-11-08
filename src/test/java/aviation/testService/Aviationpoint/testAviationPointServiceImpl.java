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
/**
 * 营业点的service层测试
 * @author 卟嗳
 *
 */




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
public class testAviationPointServiceImpl {
	@Autowired
	private IAviationPointService actService;
	//查找单个营业点测试
	@Test	
	public void testSearchAccount(){
		System.out.println(actService.findOne(1));
	}
	@Test
	//查询所有的营业点测试
	public void testfindAll(){
		List<AviationPoint> pager = actService.listfindAll(1, 1000);
		for (AviationPoint act : pager) {
			System.out.println(act);
		}
	}
	//营业点的单个删除测试
	@Test
	public void testdeleteOne() {
		System.out.println(actService.deleteOne(5));
		
	}
	//营业点的单个插入和修改
	@Test
	public void testSaveOrUpdate() {
		 AviationPoint  se = new AviationPoint(1,"美国", 10);
  	     System.out.println(actService.ServicesaveOrUpdataOne(se));
		
		
	}
	
}