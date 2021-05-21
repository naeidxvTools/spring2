package net.imwork.zhanlong.spring5;

/**
 * @author Administrator
 */
@SuppressWarnings("unused")
public class ConcreteTool implements Tool
{

    public ConcreteTool()
    {
        System.out.println("ConcreteTool实例化。");
    }

    @Override
    public String realWork()
    {
        return "realWork() is invoked.";
    }
}
