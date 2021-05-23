package net.imwork.zhanlong.spring8;

/**
 * @author Administrator
 */
public class OperationServiceImpl implements OperationService
{
    @Override
    public void view()
    {
        System.out.println("用户查看操作");
    }

    @Override
    public void update()
    {
        System.out.println("用户更新操作");
    }
}
