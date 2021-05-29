package net.imwork.zhanlong.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *   该代理类的内部属性是Object类型，实际使用的时候通过该类的构造方法传递进来一个对象
 *   此外，该类还实现了invoke方法，该方法中的method.invoke其实就是调用被代理对象的将要
 *   执行的方法，方法参数是object，表示该方法从属于object，通过动态代理类，我们可以在执行真实对象的方法前后
 *   加入自己的一些额外方法。
 *
 */

public class ProxyHandler implements InvocationHandler
{
	private final Object object;
	
	public ProxyHandler(Object object)
	{
		this.object = object;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		// 前置增强
		System.out.println("before calling: " + method);

		Object result = method.invoke(object, args);
		System.out.println(proxy.getClass());

		// 后置增强
		System.out.println("after calling: " + method);
		
		return result;
	}
}
