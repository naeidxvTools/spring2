package net.imwork.zhanlong.spring4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 */
public class SpringTest
{
    public static void main(String[] args)
    {

        BeanFactory factory = new ClassPathXmlApplicationContext("spring4-config.xml");
        Person person = (Person) factory.getBean("chinese4");

        person.test();



    }
}
