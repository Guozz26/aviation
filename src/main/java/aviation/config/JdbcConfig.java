package aviation.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement  
public class JdbcConfig {
	
	@Value(value = "${jdbc.driverClass}")
	private String driver;
	
	@Value(value="${jdbc.url}")
	private String url; 
	
	@Value(value="${jdbc.username}")
	private String username;
	
	@Value(value="${jdbc.password}")
	private String password;
	
	
	@Bean("dataSource")
	public DataSource createDataSource() {
		DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	@Bean("jdbcTmplate")
	public JdbcTemplate createJdbcTemplate(DataSource ds) {
		
		return new JdbcTemplate(ds);
	}
	
	
	// -配置事务管理器
	@Bean("transactionManager")
	public PlatformTransactionManager createTransactionManager(DataSource ds) {
		return new DataSourceTransactionManager(ds);
	}
}
