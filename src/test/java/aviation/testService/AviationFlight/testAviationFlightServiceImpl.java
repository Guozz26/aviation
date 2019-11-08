package aviation.testService.AviationFlight;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.entity.po.AviationFlight;
import aviation.entity.vo.FlightInfo;
import aviation.service.prototype.IAviationFlightService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationFlightServiceImpl {
	
	@Autowired
	private IAviationFlightService aviationFlightServcie;
	
	@Test
	public void testFindFlightAll() {
		List<AviationFlight> pagers = aviationFlightServcie.findFlightAll(1, 1);
		for (AviationFlight aviationFlight : pagers) {
			System.out.println(aviationFlight);
		}

	}
	@Test
	public void testFindFlightInfoAll() {
	FlightInfo pagers = aviationFlightServcie.findFlightInfoAll(1);
	
			System.out.println(pagers);
	
	}
	
	
	@Test
	public void testDelFlight() {
		aviationFlightServcie.delFlight(3);
	}
}
