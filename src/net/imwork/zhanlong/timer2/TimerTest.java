package net.imwork.zhanlong.timer2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring对任务调度的支持
 * @author 展龙
 */
public class TimerTest
{
	public static void main(String[] args) throws InterruptedException
	{
		new ClassPathXmlApplicationContext("timer2-config.xml");
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("timer2-config.xml"));
		
		Thread.sleep(50000);
	}
}
