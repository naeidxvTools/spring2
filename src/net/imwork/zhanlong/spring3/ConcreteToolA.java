package net.imwork.zhanlong.spring3;

/**
 * @author Administrator
 */
public class ConcreteToolA implements Tool
{
    private String name;
    @Override
    public void realWork()
    {
        System.out.println(this.name);
        System.out.println("from concreteToolA");
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }
}
