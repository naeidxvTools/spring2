package net.imwork.zhanlong.spring2;

/**
 * @author Administrator
 */
public class Chinese implements Person
{
    private Tool tool;

    public Chinese(Tool tool)
    {
        this.tool = tool;
    }

    public Chinese()
    {
    }

    public Tool getTool()
    {
        return tool;
    }

    public void setTool(Tool tool)
    {
        this.tool = tool;
    }

    @Override
    public void work()
    {
        /*
        Tool tool = new ConcreteToolA();
        tool.realWork();
         */

        tool.realWork();

    }
}
