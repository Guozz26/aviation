package aviation.testService.AviationModel;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.entity.po.AviationModel;
import aviation.service.prototype.IAviationModelService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
public class testAviationModelServiceImpl {

	@Autowired
	private IAviationModelService iaviationModelService;
	
	//机型表查询测试
	@Test
	public void chess() {
		
		AviationModel ss = iaviationModelService.chess(1);
		System.out.println(ss);
		
	}
	//--机型表更新或者修改测试
	@Test
	public void ChageModel() {
		AviationModel ss = new AviationModel(6,"ss235",23,25);
		iaviationModelService.ChageModel(ss);
		
	}
	//--机型表 的删除
	@Test
	public void  daleteModel() {
		iaviationModelService.daleteModel(2);
		
	}
	
	//--查询所有机型表中的所有信息
	
	@Test
	public void findAll() {
		List<AviationModel > ss = iaviationModelService.findAll();
		for (AviationModel aviationModel : ss) {
			System.out.println(aviationModel);
		}
		
	}
}
