package net.imwork.zhanlong.proxy.staticProxy;

public class RealSubject implements Subject
{
	public void request()
	{
		System.out.println("From real subject.");
	}
}
