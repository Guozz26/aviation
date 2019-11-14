package aviation.testDao.AviationRoot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.AppConfig;
import aviation.config.TestConfig;
import aviation.dao.prototype.IAviationRootDao;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
public class testAviationRootImpl {
	
	@Autowired
	private IAviationRootDao aviationRootDao;
	
	@Test
	public void testFindRoot() {
		System.out.println(aviationRootDao.findRoot(1));
	}
	
	
	@Test
	public void testFindRoota() {
		System.out.println(aviationRootDao.findRoot("root","root"));
	}
}
