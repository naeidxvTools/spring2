package net.imwork.zhanlong.javaMail;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * spring对javamail的支持
 * @author 展龙
 */
public class MailTest2
{
    public static void main(String[] args)
    {
//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("javaMail2-config.xml"));
        BeanFactory factory = new ClassPathXmlApplicationContext("javaMail2-config.xml");

        MailSender sender = factory.getBean("mailSender", MailSender.class);

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("120769563@qq.com");
        message.setFrom("zl20050302@163.com");
        message.setSubject("spring Java Mail Test");
        message.setText("From Spring Java Mail");

        sender.send(message);

    }
}
