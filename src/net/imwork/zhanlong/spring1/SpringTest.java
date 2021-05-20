package net.imwork.zhanlong.spring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Objects;

/**
 * @author Administrator
 *
 *     1、FileSystemXmlApplicationContext是从文件绝对路径加载配置文件
 *          ApplicationContext ctx = new FileSystemXmlApplicationContext("G:/Test/applicationcontext.xml");
 *     2、ClassPathXmlApplicationContext是从classpath下加载配置文件(适合于相对路径方式加载)
 *          ApplicationContext ctx = new ClassPathXmlApplicationContext("/WEB-INF/classes/applicationcontext.xml");
 *     3、XmlWebApplicationContext是专为web工程定制的
 *          ServletContext servletContext = request.getSession().getServletContext();
 *          ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
 */
public class SpringTest
{

    public static void main(String[] args)
    {
        /*
        工厂模式创建对象
         */
        Person p1 = PersonFactory.getPerson("chinese");
        Person p2 = PersonFactory.getPerson("american");

        System.out.println(Objects.requireNonNull(p1).hello("zhanlong"));
        System.out.println(Objects.requireNonNull(p2).hello("jinlicong"));


        //==============spring方式创建对象==========================
        /*
         * XmlBeanFactory过期解决方法
         */
        @SuppressWarnings("deprecation")
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring1-config.xml"));
        Chinese chinese = (Chinese) factory.getBean("chinese");
        System.out.println(chinese.hello("zhanlong"));

        /*
         * 现在用ClassPathXmlApplicationContext代替原来的XmlBeanFactory和ClassPathResource
         */
        BeanFactory factory1 = new ClassPathXmlApplicationContext("spring1-config.xml");
        American america = (American) factory1.getBean("american");
        System.out.println(america.bye("展龙"));





    }
}
