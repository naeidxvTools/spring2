package net.imwork.zhanlong.spring2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 */
public class SpringTest
{
    public static void main(String[] args)
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring2-config.xml");
        Person person = (Person) factory.getBean("chinese2");
        person.work();

        person = (Person) factory.getBean("chinese2_1");
        person.work();


    }
}
