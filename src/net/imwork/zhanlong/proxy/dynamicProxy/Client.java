package net.imwork.zhanlong.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client
{
	public static void main(String[] args)
	{
		//目标对象(真实对象)
		RealSubject realSubject = new RealSubject();

		InvocationHandler handler = new ProxyHandler(realSubject);

		Class<?> classType = handler.getClass();

		// 下面的代码一次性生成代理

		Subject subject = (Subject) Proxy.newProxyInstance(classType
				.getClassLoader(), realSubject.getClass().getInterfaces(),handler);

		subject.request("展龙");

		System.out.println(subject.getClass());

	}
	
	
	
	
	
	
	
	
}
