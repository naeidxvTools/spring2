package net.imwork.zhanlong.spring3;

/**
 * @author Administrator
 */
public interface Tool
{
    /**
     * 具体的工作
     */
    public void realWork();

    /**
     * getName
     * @return
     */
    public String getName();

    /**
     * setName
     * @param name
     */
    public void setName(String name);
}
