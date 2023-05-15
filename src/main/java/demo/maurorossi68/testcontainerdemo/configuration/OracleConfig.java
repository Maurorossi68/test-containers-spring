package demo.maurorossi68.testcontainerdemo.configuration;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ar.com.redlink.individuos.testcontainerdemo")
public class OracleConfig {
    @Bean
    public DataSource getDataSource()
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("oracle.jdbc.driver.OracleDriver");
        dataSourceBuilder.url("jdbc:oracle:thin:@localhost:1521");
        dataSourceBuilder.username("admin");
        dataSourceBuilder.password("admin");
        return dataSourceBuilder.build();
    }

}
