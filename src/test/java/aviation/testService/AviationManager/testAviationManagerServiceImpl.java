package aviation.testService.AviationManager;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.entity.po.AviationManager;
/*
 * 
 * 经理表的service测试
 * 
 * 
 * 
 * */
import aviation.service.prototype.IAviationManagerService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationManagerServiceImpl {

	@Autowired
	private IAviationManagerService iaviationMagerService;
	//-查询一个经理的信息
	@Test
	public void testfind() {
		AviationManager ss = iaviationMagerService.find(1);
		
		System.out.println(ss);
		
	}
	//--查询所有经理的信息
	@Test
	public void testfindAll() {
		
		List<AviationManager> list = iaviationMagerService.findAll();
		for (AviationManager aviationManager : list) {
			System.out.println(aviationManager);
		}
		
	}
	
	//--更新和修改 经理的信息
	@Test
	public void testupdateManager() {
		AviationManager ss = new AviationManager("zhaoliu","24","1345645","123123");
		iaviationMagerService.updateManager(ss);
		
	}
	
	//--删除经理
	@Test
	public  void testdeleteManager() {
		iaviationMagerService.deleteManager(3);
		
	}
	
}
