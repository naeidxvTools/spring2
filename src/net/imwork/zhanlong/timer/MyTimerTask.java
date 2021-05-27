package net.imwork.zhanlong.timer;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author 展龙
 */
public class MyTimerTask extends TimerTask
{
	private static boolean flag = false;
	
	@Override
	public void run()
	{
		if(!flag)
		{
			flag = true;
			
			System.out.println(new Date() + " start");
			
			for(int i = 0; i < 50; i++)
			{
				System.out.println(new Date() + " execution " + i);
			}
			
			flag = false;
			
			System.out.println(new Date() + " all finished");
		}
	}
}
