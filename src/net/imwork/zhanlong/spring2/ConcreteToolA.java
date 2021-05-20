package net.imwork.zhanlong.spring2;

/**
 * @author Administrator
 */
public class ConcreteToolA implements Tool
{
    @Override
    public void realWork()
    {
        System.out.println("from concreteToolA");
    }
}
