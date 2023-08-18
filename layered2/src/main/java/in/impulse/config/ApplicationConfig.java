package in.impulse.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DatabaseConfig.class)
@ComponentScan(basePackages="in.impulse")
public class ApplicationConfig {
	
	//Another Spring Bean Configuration
	@Bean
	public Date getCurrentDate() {
		return new java.util.Date();
	}
}
