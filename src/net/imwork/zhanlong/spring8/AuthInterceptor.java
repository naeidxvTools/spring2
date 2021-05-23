package net.imwork.zhanlong.spring8;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Administrator
 */
@SuppressWarnings("all")
public class AuthInterceptor implements MethodInterceptor
{
    private String username;

    public void setName(String username)
    {
        this.username = username;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable
    {
        String methodName = invocation.getMethod().getName();

        if (!"admin".equals(username) && !"user".equals(username))
        {
            System.out.println("没有权限");
            return null;
        } else if ("user".equals(username) && "update".equals(methodName))
        {
            System.out.println("普通用户无法执行更新操作");
            return null;
        }else
        {
            return invocation.proceed();
        }
    }
}
