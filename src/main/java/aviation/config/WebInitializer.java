package aviation.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
/**
 * 	Tomcat启动的时候回检测是否有WebApplicationInitializer接口的类，如果有，就会实例化它，并调用它的onStartup方法
 * @author LENOVO
 *
 */
public class WebInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		// -1.构造Spring容器
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		// -2.Spring容器加载配置 
		ctx.register(AppConfig.class);
		// -3.Spring容器接管ServletContext
		ctx.setServletContext(servletContext);
		// -4.添加Servlet（至少添加一个Servlet，SpringMVC框架实现入口Servlet）
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);	
	}

}
