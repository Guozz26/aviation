package aviation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@Import(JdbcConfig.class)
@ComponentScan({"aviation.dao","aviation.service","aviation.controller"})
@EnableAspectJAutoProxy			// - 实现AOP必须要加的标注	启用Spring AOP的功能
public class AppConfig extends WebMvcConfigurationSupport{
	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");					// - jsp文件的后缀，你在写的页面的时候省略掉后缀
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
		super.addResourceHandlers(registry);
	}
}
