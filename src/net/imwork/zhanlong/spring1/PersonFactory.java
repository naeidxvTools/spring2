package net.imwork.zhanlong.spring1;

/**
 * @author Administrator
 */
public class PersonFactory
{
    @SuppressWarnings("all")
    public static Person getPerson(String name)
    {
        if ("chinese".equalsIgnoreCase(name))
        {
            return new Chinese();
        } else if ("american".equalsIgnoreCase(name))
        {
            return new American();
        }
        return null;
    }
}
