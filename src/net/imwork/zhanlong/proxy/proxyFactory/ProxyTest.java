package net.imwork.zhanlong.proxy.proxyFactory;

/**
 * 目标是让目标对象和增强都可以切换！
 */
@SuppressWarnings("all")
public class ProxyTest
{
    public static void main(String[] args)
    {
        ProxyFactory factory = new ProxyFactory();//创建工厂
        factory.setTargetObject(new ManWaiter());//设置目标对象
        factory.setBeforeAdvice(new BeforeAdvice() {//设置前置增强
            public void before() {
                System.out.println("您好,欢迎光临！");
            }
        });

        factory.setAfterAdvice(new AfterAdvice() {//设置后置增强
            public void after() {
                System.out.println("欢迎下次再来！");
            }
        });

        Waiter waiter = (Waiter)factory.createProxy();
        waiter.serve();
        System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>");
        waiter.shouQian();

        System.out.println("=======================================");

        ProxyFactory factory2 = new ProxyFactory();//创建工厂
        factory.setTargetObject(new ManWaiter());//设置目标对象
        factory.setBeforeAdvice(new BeforeAdvice() {//设置前置增强
            public void before() {
                System.out.println("您好,请您还钱！");
            }
        });

        factory.setAfterAdvice(new AfterAdvice() {//设置后置增强
            public void after() {
                System.out.println("欢迎下次再来借钱！");
            }
        });

        Waiter waiter2 = (Waiter)factory.createProxy();
        waiter.shouQian();
    }


}
