import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;

/**
 * @ClassName MailDemo01
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/3 8:54
 */
public class MailDemo01 {
    public static void main(String[] args) throws GeneralSecurityException, MessagingException {

        Properties prop = new Properties();
        prop.setProperty("mail.host", "smtp.qq.com");//设置QQ邮件服务器
        prop.setProperty("mail.transport.protocol", "smtp");//邮件发送协议
        prop.setProperty("mail.smtp.auth", "true");//需要验证用户名密码

        //关于QQ邮箱，还要设置SSL加密，加上以下代码即可，其他邮箱不需要！
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        prop.put("mail.smtp.ssl.enable", "true");
        prop.put("mail.smtp.ssl.socketFactory", sf);

        //使用JavaMail发送邮件的5个步骤

        //1、创建定义整个应用程序所需的环境信息的Session对象
        //创建定义整个应用程序所需的环境信息的 Session对象

        //QQ邮箱需以下设置
        Session session = Session.getDefaultInstance(prop, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                //发送人邮件用户名、授权码
                return new PasswordAuthentication("2417359111@qq.com", "tflburfbtornecgi");
            }
        });

        //开启 session的 debug 模式，这样就可以查看到程序发送 Email 的运行状态
        session.setDebug(true);

        //2、通过session得到 transport对象
        Transport ts = session.getTransport();

        //3、使用邮箱的用户名和授权码连上邮件服务器
        ts.connect("smtp.qq.com", "2417359111@qq.com", "tflburfbtornecgi");

        //4、创建邮件：写邮件
        //注意需要传递 Session
        MimeMessage message = new MimeMessage(session);

        //指明邮件的收件人，现在发件人和收件人是一样的，那就是自己给自己发
        message.setFrom(new InternetAddress("2417359111@qq.com"));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("2417359111@qq.com"));

        //邮件的标题
        message.setSubject("学习邮件发送");

        //邮件的文本内容
        message.setContent("<h1 style='color:red'>Hello World</h1>", "text/html;charset=UTF-8");

        //5、发送邮件
        ts.sendMessage(message, message.getAllRecipients());

        //6、关闭连接
        ts.close();

    }
}
