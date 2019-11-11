package aviation.testDao.AviationFlight;



import java.util.Date;
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
import aviation.util.DateUtil;


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
	
	@Test
	public void testFindFlightGo() {
		
		System.out.println(DateUtil.toDate("yyyy-MM-dd", "2019-11-06"));
		System.out.println("您所查看的航班如下");
		List<FlightInfo> lists = 
				aviationFlightDao.findFlightGo(
						5, 0, "北京", "上海",DateUtil.toDate("yyyy-MM-dd", "2019-11-06"));
		System.out.println(lists.size());
		for (FlightInfo a : lists) {
			System.out.println("123"+a);
		}
	}
	@Test
	public void testInsertOrUpdate() {
		aviationFlightDao.inertOrUpdateFlight(new AviationFlight(12,"1123231", "2", new Date(), new Date(), 50, 400 ,1));
	}
	
	@Test
	public void testFindFligthMaxId() {
		int a  = aviationFlightDao.fingFlightMaxId();
		System.out.println(a);
	}
}
