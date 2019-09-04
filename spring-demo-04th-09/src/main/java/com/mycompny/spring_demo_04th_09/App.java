package com.mycompny.spring_demo_04th_09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompny.spring_demo_04th_09.bean.BaseballCoach;
import com.mycompny.spring_demo_04th_09.bean.Coach;
import com.mycompny.spring_demo_04th_09.bean.CricketCoach;
import com.mycompny.spring_demo_04th_09.bean.Employee;

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
        	Coach theCoach=context.getBean("theCoach",Coach.class);
        	System.out.println(theCoach.getDailyWorkout()+" "+theCoach.getDailyFortune());
			context.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
