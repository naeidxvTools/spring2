package net.imwork.zhanlong.spring1;

/**
 * @author Administrator
 */
public class Chinese implements Person
{
    @Override
    public String hello(String name)
    {
        return name + " : 你好。";
    }

    @Override
    public String bye(String name)
    {
        return name + " : 再见。";
    }
}
