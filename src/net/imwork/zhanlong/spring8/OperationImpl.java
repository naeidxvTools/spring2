package net.imwork.zhanlong.spring8;

/**
 * @author Administrator
 */
public class OperationImpl implements Operation
{
    private OperationService service;

    public void setService(OperationService service)
    {
        this.service = service;
    }

    @Override
    public void view()
    {
        service.view();
    }

    @Override
    public void update()
    {
        service.update();
    }
}
