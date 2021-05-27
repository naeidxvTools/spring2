package net.imwork.zhanlong.myAspectJ1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 1.基于注解的方式
 *
 * @author Administrator
 */

@Aspect
@SuppressWarnings("all")
public class MyAspectJ
{
    /*
    AspectJ语法:
        execution([修饰符] 返回类型 [声明类型] 方法名称(参数类型) [异常类型]), 其中用的最多的是通配符:*; []为可选的; 两个点代表任意参数。

            例子：
            1.执行任意的public方法
                execution(public * * (..))
            2.执行任意以set开头的方法
                execution(* set*(..))
            3.执行任何至少有一个参数，且第一个参数为java.lang.String类型的方法
                execution(* * (java.lang.String, ..))
            4.执行Service类中的任何方法
                execution(* net.imwork.zhanlong.Service.*(..))
            5.执行test包及其子包的任意接口或类的任意方法
                execution(* test.*.*(..))
            6.执行可能抛出IOException异常的方法
                execution(* * (..) throws IOException)
     */

    @Pointcut("execution(public * execute(..)) && target(net.imwork.zhanlong.myAspectJ1.Person)")
    // @Pointcut("execution(public * * (..))")
    public void pointcut()
    {
    }

    @Before("pointcut()")
    public void beforeExecute(JoinPoint joinPoint)
    {
        System.out.println("前置通知：before execute");
    }

    @Around("pointcut()")
    public Object myOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("环绕通知：进入myOperation");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕通知：退出myOperation");
        return proceed;
    }

    @After("pointcut()")
    public void afterExecute(JoinPoint joinPoint)
    {
        System.out.println("后置通知：after execute");
    }
}
