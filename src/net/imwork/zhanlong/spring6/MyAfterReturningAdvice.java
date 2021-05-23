package net.imwork.zhanlong.spring6;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author Administrator
 */
public class MyAfterReturningAdvice implements AfterReturningAdvice
{
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable
    {
        System.out.println("方法调用结束");
        System.out.println("返回值是: " + returnValue);
        System.out.println("执行的方法是: " + method);
        System.out.println("方法参数是: " + args);
        System.out.println("目标对象是: " + target);
    }
}
