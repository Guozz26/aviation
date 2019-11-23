package aviation.testDao.AviationBoss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.dao.prototype.IAviationBossDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationBossImpl {
	

	@Autowired 
	private IAviationBossDao iaviationBossrDao;
	
	@Test
	public void testfindBoss() {
		iaviationBossrDao.fingBoss("boss", "123456");
		
	}

}
