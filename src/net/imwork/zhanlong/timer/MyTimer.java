package net.imwork.zhanlong.timer;

import java.util.Timer;

/**
 * jdk的任务调度
 * 使用ScheduledExecutorService代替Timer吧
 * @author 展龙
 */
public class MyTimer
{
	public static void main(String[] args)
	{
		Timer timer = new Timer(true);

		// 每5秒钟调度一次
		timer.schedule(new MyTimerTask(), 0, 5000);
		
		try
		{
			Thread.sleep(12000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		timer.cancel();
		
		try
		{
			Thread.sleep(400000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
