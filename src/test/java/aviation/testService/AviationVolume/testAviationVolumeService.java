package aviation.testService.AviationVolume;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.service.prototype.IAviationVolumeService;
import aviation.util.DateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationVolumeService {

	@Autowired
	private IAviationVolumeService volumenService;
	
	@Test
	public void tesDayVolume() {
		double a = volumenService.salesmanVolume(1, DateUtil.toDate("yy-MM-dd", "2019-11-11"),3);
		System.out.println(a);
	}
	
	@Test
	public void testPointVolume() {
		double a = volumenService.pointVolume(2, DateUtil.toDate("yy-MM-dd", "2019-11-13"), 3);
		System.out.println(a);
	}
	
	@Test
	public void testAllVolume() {
		double a = volumenService.allVolume(DateUtil.toDate("yy-MM-dd", "2019-11-13"), 2);
		System.out.println(a);
	}
}
