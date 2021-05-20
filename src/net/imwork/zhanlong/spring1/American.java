package net.imwork.zhanlong.spring1;

/**
 * @author Administrator
 */
public class American implements Person
{
    @Override
    public String hello(String name)
    {
        return name + ": hello";
    }

    @Override
    public String bye(String name)
    {
        return name + ": bye";
    }
}
