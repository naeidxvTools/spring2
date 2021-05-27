package net.imwork.zhanlong.javaMail;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 *  Java邮件发送（JavaMail）
 *  SMTP（Simple Mail Transfer Protocol），简单邮件发送协议
 *  POP3，邮局协议
 *
 * @author 展龙
 */
@SuppressWarnings("all")
public class MailTest1
{
    // 收件人
    private String to;
    // 发件人
    private String from;

    // smtp邮件服务器的地址
    private String smtpServer;
    private String username;
    private String password;
    private String subject;
    private String content;

    private List<String> list = new ArrayList<>();

    public void sendMail()
    {
        Properties props = System.getProperties();

        // 设置主机的地址
        props.put("mail.smtp.host", smtpServer);
        // 是否服务器接收验证
        props.put("mail.smtp.auth", true);

        // Session（会话）：每次发送和接收邮件都是一次会话
        Session session = Session.getDefaultInstance(props, new Authenticator()
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(username, password);
            }
        });

        try
        {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            InternetAddress[] addresses = {new InternetAddress(to)};
            message.setRecipients(Message.RecipientType.CC, addresses);
            message.setSubject(subject);
            message.setText(content);

            Multipart mp = new MimeMultipart();
            MimeBodyPart mbp = new MimeBodyPart();
            mbp.setText(content);
            mp.addBodyPart(mbp);

            // 处理附件
            for (String fileName : list)
            {
                MimeBodyPart mbpFile = new MimeBodyPart();
                FileDataSource fds = new FileDataSource(fileName);
                mbpFile.setDataHandler(new DataHandler(fds));

                mbpFile.setFileName(new File(fileName).getName());
                mp.addBodyPart(mbpFile);
            }
            message.setContent(mp);
            message.setSentDate(new Date());

            Transport.send(message);

        } catch (Exception e){e.printStackTrace();}

    }

    public static void main(String[] args)
    {
        MailTest1 mail = new MailTest1();

        mail.setSmtpServer("smtp.163.com");
        mail.setUsername("zl20050302");
        mail.setPassword("nd20181212@1219");
        mail.setTo("120769563@qq.com");
        mail.setFrom("zl20050302@163.com");
        mail.setSubject("hello java email");
        mail.setContent("This is a test mail from zhanlong");

        mail.getList().add("C:/java_software/mysql-connector-java-8.0.15.jar");
        mail.getList().add("C:/java_software/ZoomIt4.5_cn/使用说明.doc");

        mail.sendMail();

    }

    public String getTo()
    {
        return to;
    }

    public void setTo(String to)
    {
        this.to = to;
    }

    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getSmtpServer()
    {
        return smtpServer;
    }

    public void setSmtpServer(String smtpServer)
    {
        this.smtpServer = smtpServer;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public List<String> getList()
    {
        return list;
    }

    public void setList(List<String> list)
    {
        this.list = list;
    }
}
