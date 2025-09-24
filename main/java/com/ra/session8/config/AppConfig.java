package com.ra.session8.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages ="com.ra.session8" )
@EnableTransactionManagement
public class AppConfig {
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/session8_manager");
        dataSource.setUsername("root");
        dataSource.setPassword("12345678");
        return dataSource;
    }
    @Bean
    public LocalSessionFactoryBean sessionFactoryBean(){
        LocalSessionFactoryBean sessionFactoryBean=new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setPackagesToScan("com.ra.session8.model.entity");
        Properties props=new Properties();
        props.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
        props.put("hibernate.show_sql","true");
        props.put("hibernate.format_sql","true");
        props.put("hibernate.hbm2ddl.auto","update");
        sessionFactoryBean.setHibernateProperties(props);
        return sessionFactoryBean;

    }@Bean
    public HibernateTransactionManager transactionManager(){
        HibernateTransactionManager transactionManager=new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactoryBean().getObject());
        return transactionManager;
    }

}
