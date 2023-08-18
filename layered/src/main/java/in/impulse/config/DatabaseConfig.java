package in.impulse.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value = "classpath:database.properties")
public class DatabaseConfig {
	
	@Value("${MySqlDriverClassName}")		// SpEL
	private String driverClass;
	
	@Value("${MySqlDriverUrl}")
    private String driverUrl;
    
	@Value("${MySqlUsername}")
    private String username;
    
	@Value("${MySqlPassword}")
    private String password;
    
    //DataSource Configuration
    @Bean
    public DataSource getDataSource() {
		DriverManagerDataSource dds = new DriverManagerDataSource();
		dds.setDriverClassName(driverClass);
		dds.setUrl(driverUrl);
		dds.setUsername(username);
		dds.setPassword(password);
		return dds;
	}
    
    @Bean
    public JdbcTemplate getJdbcTemplate() {
    	JdbcTemplate jt = new JdbcTemplate();
    	jt.setDataSource(getDataSource());
    	return jt;
    }

}
