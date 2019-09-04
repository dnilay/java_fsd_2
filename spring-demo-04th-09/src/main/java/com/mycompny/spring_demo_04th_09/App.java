package com.mycompny.spring_demo_04th_09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompny.spring_demo_04th_09.bean.BaseballCoach;
import com.mycompny.spring_demo_04th_09.bean.Coach;
import com.mycompny.spring_demo_04th_09.bean.CricketCoach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	
        	ClassPathXmlApplicationContext context=new 
        			ClassPathXmlApplicationContext("applicationContext.xml");
        	Coach myCoach=context.getBean("theCoach",BaseballCoach.class);
        	System.out.println(myCoach.getDailyWorkout());
        	Coach myCoach1=context.getBean("theCoach",BaseballCoach.class);
        	System.out.println(myCoach==myCoach1);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
