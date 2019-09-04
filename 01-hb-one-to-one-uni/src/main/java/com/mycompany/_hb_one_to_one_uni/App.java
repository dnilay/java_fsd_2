package com.mycompany._hb_one_to_one_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany._hb_one_to_one_uni.entity.Instructor;
import com.mycompany._hb_one_to_one_uni.entity.InstructorDetail;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
        	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session=factory.getCurrentSession();
			Instructor tempInstructor=new Instructor();
			InstructorDetail detail=new InstructorDetail("http://youtube.com/bowling", "Guiter");
			tempInstructor.setFirstName("Ravi");
			tempInstructor.setLastName("Shastry");
			tempInstructor.setEmail("shastry@luv2code.com");
			tempInstructor.setInstructorDetail(detail);
			session.getTransaction().begin();
			session.persist(tempInstructor);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
    }
}
