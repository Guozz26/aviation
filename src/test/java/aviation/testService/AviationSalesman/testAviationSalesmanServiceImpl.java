package aviation.testService.AviationSalesman;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.entity.po.AviationSalesman;
import aviation.service.prototype.IAviationSalesmanService;
import aviation.util.DateUtil;
/**
 * 营业员的service层测试类
 * @author 卟嗳
 *
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
public class testAviationSalesmanServiceImpl {
	@Autowired
	private IAviationSalesmanService avi;
	//查找单个营业员测试
	@Test	
	public void testSearchfindOne(){
		System.out.println(avi.findOne(3));
	}
	//删除单个营业员的测试
	@Test	
	public void testdelete(){
		avi.deleteOne(4);
	}
	//查询整个营业员的测试
	@Test
	public void testfindAll() {
		List<AviationSalesman> pages = avi.findAll(1, 100);
		  for(AviationSalesman a : pages) {
			  System.out.println(a);
		  }
	}
	//插入和修改单个营业员的测试
	@Test
	public void  testSaveOrUpdate() {
		  AviationSalesman a = new AviationSalesman(10,"史路文","猛男", 
		        	DateUtil.toDate("yyyy-MM-dd hh:mm:ss",  "1997-01-08 23:03:20"),"slw3456", 7);
		  System.out.println(avi.saveOrUpdataOne(a));
	}
}
