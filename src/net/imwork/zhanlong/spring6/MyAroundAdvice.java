package net.imwork.zhanlong.spring6;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Administrator
 */
public class MyAroundAdvice implements MethodInterceptor
{
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable
    {
        System.out.println("进入到invoke方法 " + invocation);

        Object object = invocation.proceed();

        System.out.println("invoke方法执行完毕");

        return object;
    }
}
