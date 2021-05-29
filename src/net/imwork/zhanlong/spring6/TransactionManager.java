package net.imwork.zhanlong.spring6;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author Administrator
 */
public class TransactionManager implements ThrowsAdvice
{
    /**
     * 注意：-->这里的文件名必须是：afterThrowing
     *      public void afterThrowing(Exception ex)
     *      public void afterThrowing(RemoteException)
     *      public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
     *      public void afterThrowing(Method method, Object[] args, Object target, ServletException ex)
     * @param method
     * @param args
     * @param target
     * @param ex
     */
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
    {
        System.out.println("---------------------");

        System.out.println("method: " + method.getName());

        System.out.println("抛出异常: " + ex.getMessage());

        System.out.println("成功回滚事务");
    }
}
