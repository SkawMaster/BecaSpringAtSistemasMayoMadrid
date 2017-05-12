package com.atsistemas;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.atsistemas.persistencia.HibernatePersonaDao;

@Configuration
@EnableTransactionManagement
public class ConfiguracionHibernate {

	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory){
		return new HibernateTransactionManager(sessionFactory);
	}
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl("jdbc:derby://localhost:1527/Disney;create=true");
		basicDataSource.setUsername("admin");
		basicDataSource.setPassword("admin");
		basicDataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver40");
		return basicDataSource;
	}

	@Bean
	@Autowired
	public LocalSessionFactoryBean localSessionFactoryBean(DataSource dataSource) {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();

		localSessionFactoryBean.setDataSource(dataSource);
		localSessionFactoryBean.setPackagesToScan("com.atsistemas.entidades");
		Properties properties = new Properties();

		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyTenSevenDialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "create");

		localSessionFactoryBean.setHibernateProperties(properties);

		return localSessionFactoryBean;
	}
	
	@Bean
	@Autowired
	public HibernatePersonaDao hibernatePersonaDao(SessionFactory sessionFactory){
		return new HibernatePersonaDao(sessionFactory);
	}

}
