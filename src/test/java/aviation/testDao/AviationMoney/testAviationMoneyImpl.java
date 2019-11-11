package aviation.testDao.AviationMoney;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.dao.prototype.IAviationMoneyDao;
import aviation.entity.po.AviationModel;
import aviation.entity.po.AviationMoney;

/*
 * 钱的测试
 * 
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationMoneyImpl {
	@Autowired
	private IAviationMoneyDao  aviationMoneyDao;
	
	//查
		@Test
		public void modelcha(){
				AviationMoney  ss  = aviationMoneyDao.chess(1);
				
				System.out.println(ss);
		}
		//修改
		@Test
		public void modelfeng() {
			AviationMoney ss = new AviationMoney(1,1,1);
			
			aviationMoneyDao.ChageMoney(ss);
			
		}
		
		//删除
		@Test
		public void testdelet() {
			aviationMoneyDao.daleteMoney(1);
			
		}
		
		@Test
		public void testFindAll() {
			List<AviationMoney> lists = aviationMoneyDao.findAll();
			for (AviationMoney aviationMoney : lists) {
				System.out.println(aviationMoney);
			}
			
		}
	
}
