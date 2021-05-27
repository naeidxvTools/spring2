package net.imwork.zhanlong.timer2;

import java.util.TimerTask;

/**
 * @author 展龙
 */
public class MyTimerTask extends TimerTask
{
	@Override
	public void run()
	{
		System.out.println("my timer task executed");
		
		try
		{
			System.out.println("go into try block");
			
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
