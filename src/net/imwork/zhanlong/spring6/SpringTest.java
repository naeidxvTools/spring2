package net.imwork.zhanlong.spring6;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author Administrator
 */
public class SpringTest
{

    public static void main(String[] args)
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring6-config.xml");

        Person person = (Person) factory.getBean("person");
        person.study();

        Dog dog = (Dog) factory.getBean("dog");
        System.out.println("=========:::: " + dog.getClass().getName());
        try
        {
            dog.remove();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        try
        {
            dog.save();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
