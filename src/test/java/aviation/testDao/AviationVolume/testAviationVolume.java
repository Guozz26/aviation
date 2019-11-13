package aviation.testDao.AviationVolume;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.dao.prototype.IAviationVolumeDao;
import aviation.entity.vo.VolumeInfo;
import aviation.util.DateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationVolume {
	
	@Autowired
	private IAviationVolumeDao volumeDao;
	
	@Test
	public void testSelectPointVolume() {
		List<VolumeInfo> lists = volumeDao.selectPointVolume(1, DateUtil.toDate("yy-MM-dd", "2019-11-13"),3);
		for (VolumeInfo volumeInfo : lists) {
			System.out.println(volumeInfo);
		}
	}
	
	@Test
	public void testSelectSalesmanVolume() {
		List<VolumeInfo> lists = volumeDao.selectSalesman(1, DateUtil.toDate("yy-MM-dd", "2019-11-11"),3);
		for (VolumeInfo volumeInfo : lists) {
			System.out.println(volumeInfo);
		}
	}
	
}
