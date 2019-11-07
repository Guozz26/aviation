package aviation.util;

import java.lang.reflect.Method;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/*
 * 
 *  自定义的切面
 */
@Aspect
@Component
public class PagerAspect {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	// -定义切点，执行的位置是service下所有的包的所有的类的所有的方法
	//-@Pointcut("execution(* service..*(..))")
	//@Pointcut("execution(* service..*(..))")
	@Pointcut("execution(* aviation.service..*(..))")
	public void selfPointcut() {}
	
	
	@Around("selfPointcut()")
	public Object aroundAdvice(ProceedingJoinPoint jp) {
		System.out.println(1);
		Pager pager = new Pager();
		Object o = null;
		// -根据jp对象获取Method对象
		MethodSignature signature = (MethodSignature) jp.getSignature();
		Method m = signature.getMethod();
		
		MiniPager miniPager = m.getAnnotation(MiniPager.class);
		// -做判断
		if(miniPager == null) {  // -没有标注。则执行原始的业务方法
			try {
				o = jp.proceed();
			} catch (Throwable e) {
				e.printStackTrace();
			}
			return o;
		}else {	// -如果有标注
			// -获取某实体类对应的总的条目数
			
			String table  = miniPager.tableName();
			
			int totalItems = jdbcTemplate.queryForObject("select count(*) from "+table+"",
					Integer.class);
			//System.out.println(totalItems);
			// -跟据页大小计算总的页数
			int pageSize = (Integer)jp.getArgs()[1];
			
			//System.out.println(pageSize);
			int totalPages = (totalItems + pageSize -1)/pageSize;
			int pageNO = (Integer)jp.getArgs()[0];
			if(pageNO>=totalPages) pageNO = totalPages;
			// -返回分页对象
			
			try {
				List data = (List)jp.proceed(new Object[] {pageNO,pageSize});
				pager.setData(data);
				pager.setTotal(totalPages);
				//o = pager;
			} catch (Throwable e) { 
				e.printStackTrace();
			}				
		}
			return pager;
}}