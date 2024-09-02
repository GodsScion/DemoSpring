package com.springbokka.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Dev dev = (Dev) app.getBean("devId");   //Dev dev = app.getBean(Dev.class);
    	dev.build();
    }
}
