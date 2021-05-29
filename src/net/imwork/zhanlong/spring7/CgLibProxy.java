package net.imwork.zhanlong.spring7;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Administrator
 */
public class CgLibProxy implements MethodInterceptor
{
    private final Enhancer enhancer = new Enhancer();

    public Object getProxy(Class<?> clazz)
    {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable
    {
        System.out.println(o.getClass().getName() + "." + method.getName());

        Object result = methodProxy.invokeSuper(o, objects);

        System.out.println("执行结束");

        return result;
    }

    public static void main(String[] args)
    {
        CgLibProxy proxy = new CgLibProxy();
        Person person = (Person) proxy.getProxy(Person.class);

        person.study();
    }
}
