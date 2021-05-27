package net.imwork.zhanlong.spring_test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;

/**
 * 关于Web下的单元测试
 *  1）容器内测试
 *  2）Mock测试（模拟测试）：包括JMock和easyMock两种框架测试，都很常用
 *
 *   spring对mock测试的支持
 *
 * @author 展龙
 */
public class ServletTest
{
    @Test
    public void testServlet()
    {
        // 模拟request对象
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addParameter("username", "zhangsan");

        // 实例化Servlet对象
        // 调用Servlet对象的doGet或者doPost方法
        Assert.assertEquals("zhangsan", request.getParameter("username"));

        // 模拟session对象
        MockHttpSession session = new MockHttpSession();
        session.setAttribute("username", "lisi");
        Assert.assertEquals("lisi",session.getAttribute("username"));

    }
}
