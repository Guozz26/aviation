package aviation.testDao.AviationModel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.dao.prototype.IAviationModelDao;
import aviation.entity.po.AviationModel;
/*
 * 机型测试
 * 
 * 
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationModelImpl {

	@Autowired
	private IAviationModelDao  aviationModelDao;
	//查
	@Test
	public void modelcha(){
			AviationModel  ss  = aviationModelDao.chess(1);
			
			System.out.println(ss);
	}
	//修改
	@Test
	public void modelfeng() {
		AviationModel ss = new AviationModel(4,"d21",25,25);
		
		aviationModelDao.ChageModel(ss);
		
	}
	
	//删除
	@Test
	public void testdelet() {
		aviationModelDao.daleteModel(3);
		
	}
}

