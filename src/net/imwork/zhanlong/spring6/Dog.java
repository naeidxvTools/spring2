package net.imwork.zhanlong.spring6;

import java.sql.SQLException;

/**
 * @author Administrator
 */
public class Dog
{
    public void remove()
    {
        throw new RuntimeException("抛出了运行时异常");
    }

    public void save() throws SQLException
    {
        throw new SQLException("抛出了数据库异常");
    }
}
