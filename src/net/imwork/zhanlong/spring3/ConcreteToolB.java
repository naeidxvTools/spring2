package net.imwork.zhanlong.spring3;

/**
 * @author Administrator
 */
public class ConcreteToolB implements Tool
{
    private String name;
    @Override
    public void realWork()
    {
        System.out.println("from concreteToolB");
    }

    @Override
    public String getName()
    {
        return null;
    }

    @Override
    public void setName(String name)
    {

    }
}
