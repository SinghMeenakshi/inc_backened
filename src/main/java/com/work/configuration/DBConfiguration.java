package com.work.configuration;


import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.work.model.Authorities;
import com.work.model.BookTour;
import com.work.model.Booking;
import com.work.model.Category;
import com.work.model.Pack;
import com.work.model.Tourist;
import com.work.model.User;


@Configuration
@EnableTransactionManagement
public class DBConfiguration
 {
		//<bean id="" class="">
		@Bean(name="dataSource")
		public DataSource getDataSource() {
		    BasicDataSource dataSource = new BasicDataSource();
		    dataSource.setDriverClassName("org.h2.Driver");
		    dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		    dataSource.setUsername("sa");
		    dataSource.setPassword("");
		    return dataSource;
		}
		@Bean
		public SessionFactory sessionFactory() {
			LocalSessionFactoryBuilder lsf=
					new LocalSessionFactoryBuilder(getDataSource());
			Properties hibernateProperties=new Properties();
			hibernateProperties.setProperty(
					"hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
			hibernateProperties.setProperty("hibernate.show_sql", "true");
			lsf.addProperties(hibernateProperties);
			Class classes[]=new Class[]{Pack.class,Category.class,User.class,Authorities.class,Booking.class,Category.class,Tourist.class,Booking.class,BookTour.class};
		    return lsf.addAnnotatedClasses(classes).buildSessionFactory();
		}
		@Bean
		public HibernateTransactionManager hibTransManagement(){
			return new HibernateTransactionManager(sessionFactory());
		}
	}

