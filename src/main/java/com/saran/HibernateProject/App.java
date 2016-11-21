package com.saran.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.saran.model.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      UserDetails u1=new UserDetails();
      //UserDetails67 u1=new UserDetails67();
      u1.setUserName("Rekha");
      @SuppressWarnings("depreciation")
      SessionFactory sf= new Configuration().configure().buildSessionFactory();
      Session s1=sf.openSession();
      s1.beginTransaction();
      s1.save(u1);
      s1.getTransaction().commit();
      System.out.println(u1.getUserId()+"   "+u1.getUserName());
      s1.close();
    }
}