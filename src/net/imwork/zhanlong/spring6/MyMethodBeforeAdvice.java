package net.imwork.zhanlong.spring6;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Administrator
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice
{
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable
    {
        System.out.println("进入到before方法");
        System.out.println("执行的方法是: " + method);
        System.out.println("方法参数是: " + args);
        System.out.println("目标对象是: " + target);
    }
}
