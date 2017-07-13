package com.work.inc_backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.work.configuration.DBConfiguration;
import com.work.dao.PackDaoImp;
import com.work.model.Pack;
import com.work.service.PackServiceImp;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class);
    }
}
