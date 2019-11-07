package aviation.testDao.AviationFlight;



import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.dao.prototype.IAviationFlightDao;
import aviation.entity.po.AviationFlight;
import aviation.entity.vo.FlightInfo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationFlightImpl {
	
	@Autowired
	private IAviationFlightDao  aviationFlightDao;
	
	@Test
	public void  testFindAll() {
		
		List<AviationFlight> pagers  =  aviationFlightDao.findFlightAll(5, 0);
		for (AviationFlight a : pagers) {
			System.out.println(a);
		}
	
	}
	@Test
	public void testFindAllFlightInfo() {
		FlightInfo lists  = aviationFlightDao.findFlightInfoAll(1);
		
			System.out.println(lists);
	
	}
	
	@Test
	public void testDelFlight() {
		int a = aviationFlightDao.delFlight(3);
		System.out.println(a);
	}
}
