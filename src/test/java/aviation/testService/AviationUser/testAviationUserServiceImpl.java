package aviation.testService.AviationUser;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.entity.po.AviationUser;
import aviation.service.prototype.IAviationUserService;
import aviation.util.DateUtil;

/*
 * 
 * 用户表service层测试
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationUserServiceImpl {

	@Autowired
	private IAviationUserService iAviationuserService;
	//--查询单个
	@Test
	public void userfind() {
		AviationUser ss = iAviationuserService.find(1);
		System.out.println(ss);
		
	}
	//查询所有
	@Test
	public void userfindAll() {
		List<AviationUser> ss = iAviationuserService.findAll();
		for (AviationUser aviationUser : ss) {
			System.out.println(aviationUser);
		}
		
		
	}
	//--修改和更新用户
	
	@Test
	public void userupdate() {
		
		AviationUser ss =  new AviationUser(1,"li","123456","男",DateUtil.toDate("yyyy-MM-dd hh:mm:ss", "1997-06-13 23:12:12"));
		iAviationuserService.updateUser(ss);
	}
	
	//--删除 用户
	@Test
	public void userdele() {
		iAviationuserService.deleteUser(2);
		
	}
	
}
