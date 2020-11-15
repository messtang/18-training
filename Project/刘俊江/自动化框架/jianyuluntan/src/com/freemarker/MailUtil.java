package com.freemarker;

import java.io.IOException;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.webtest.utils.ReadProperties;

public class MailUtil {

	
	public static void sendEmail(String to,String to_user, String subject, String body) throws MessagingException, IOException {
		//创建一个邮件
		Properties props = new Properties();
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.smtp.host", ReadProperties.getPropertyValue("server"));
		props.setProperty("mail.smtp.auth", "true");
		Session session = Session.getDefaultInstance(props);
		MimeMessage message =new MimeMessage(session);
		
		//2、From 发件人
		String from = ReadProperties.getPropertyValue("frommail");
		String user = ReadProperties.getPropertyValue("from_user");
		message.setFrom(new InternetAddress(from,user,"UTF-8"));
		
		//3、To 收件人
		message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(to,to_user,"UTF-8"));
		
		//4、Subject 邮件主题
		message.setSubject(subject,"UTF-8");
		
		//5、Content 邮件正文
		message.setContent(body,"text/html;charset=UTF-8");
		
		//保存前面的设置
		message.saveChanges();
		
		String password = ReadProperties.getPropertyValue("auth_code");
		Transport transport = session.getTransport();
		transport.connect(from,password);
		transport.sendMessage(message, message.getAllRecipients());
		
		transport.close();
	}
	
}
