package aviation.testService.AviationBoss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.service.prototype.IAviationBossService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationBossServiceImpl {
	
	
	@Autowired
	private IAviationBossService aviationBossServcie;
	

	@Test
	public void testfindBoss() {
		aviationBossServcie.fingBoss("boss", "123456");
		
	}
	

}
