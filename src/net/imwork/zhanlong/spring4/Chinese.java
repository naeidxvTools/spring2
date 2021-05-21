package net.imwork.zhanlong.spring4;

import java.util.*;

/**
 * @author Administrator
 */
public class Chinese implements Person
{
    private List list = new ArrayList();
    private Map map = new HashMap();
    private Set set = new HashSet();
    private Properties properties = new Properties();

    public List getList()
    {
        return list;
    }

    public void setList(List list)
    {
        this.list = list;
    }

    public Map getMap()
    {
        return map;
    }

    public void setMap(Map map)
    {
        this.map = map;
    }

    public Set getSet()
    {
        return set;
    }

    public void setSet(Set set)
    {
        this.set = set;
    }

    public Properties getProperties()
    {
        return properties;
    }

    public void setProperties(Properties properties)
    {
        this.properties = properties;
    }

    @Override
    public void test()
    {
        System.out.println(this.list);
        System.out.println(this.map);
        System.out.println(this.set);
        System.out.println(this.properties);

    }
}
