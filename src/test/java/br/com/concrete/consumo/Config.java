package br.com.concrete.consumo;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by assis on 06/03/17.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("stepDefinition.*")
public class Config {
    @Bean(name = "dbUnitDatabaseConnection")
    public DataSource dbUnitDatabaseConnection() throws SQLException {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:file:~/cs-consumo-test;DB_CLOSE_ON_EXIT=FALSE");
        dataSource.setUsername("sa");
        dataSource.setPassword("");

        return dataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager() throws SQLException {
        return new DataSourceTransactionManager(dbUnitDatabaseConnection());
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        return new TomcatEmbeddedServletContainerFactory();
    }
}
