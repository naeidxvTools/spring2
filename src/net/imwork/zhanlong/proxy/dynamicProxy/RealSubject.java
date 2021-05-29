package net.imwork.zhanlong.proxy.dynamicProxy;

public class RealSubject implements Subject
{
	public void request(String name)
	{
		System.out.println("name = " +name + ", From real subject!");
	}

}
