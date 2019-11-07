package aviation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"aviation.dao","aviation.service","aviation.controller"})
@Import(JdbcConfig.class)
@EnableAspectJAutoProxy
public class TestConfig {
	
}
