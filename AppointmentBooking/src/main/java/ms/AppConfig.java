package ms;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
		driverManagerDataSource.setUsername("postgres");
		driverManagerDataSource.setPassword("madhu");
		driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
		return driverManagerDataSource;
	}
}