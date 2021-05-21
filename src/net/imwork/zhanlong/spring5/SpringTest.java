package net.imwork.zhanlong.spring5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 */
public class SpringTest
{
    @SuppressWarnings("all")
    public static void main(String[] args)
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring5-config.xml");

        Person person = (Person) factory.getBean("chinese5");
        person.work();

        ((ClassPathXmlApplicationContext)factory).destroy();

    }
}
