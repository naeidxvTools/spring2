package net.imwork.zhanlong.myAspectJ2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 基于xml配置文件方式的aspectj
 * @author Administrator
 */
public class MyAspectJ
{
    public void beforeExecute(JoinPoint joinPoint)
    {
        System.out.println("前置通知：before execute2");
    }

    public Object myOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("环绕通知：进入myOperation");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕通知：退出myOperation");
        return proceed;
    }

    public void afterExecute(JoinPoint joinPoint)
    {
        System.out.println("后置通知：after execute2");
    }
}
