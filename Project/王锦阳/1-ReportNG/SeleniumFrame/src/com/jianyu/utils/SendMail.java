package com.jianyu.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import com.jianyu.base.BaseTest;
import com.sun.mail.util.MailSSLSocketFactory;


public class SendMail extends BaseTest{
	
	public static void main(String[] args) throws IOException, GeneralSecurityException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("conf/config.properties");
		prop.load(fis);
		String sender = prop.getProperty("sender");
		String auth_code = prop.getProperty("auth_code");
		String to = prop.getProperty("tomail");
		MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
		Properties props=new Properties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.host", "smtp.163.com");
		props.put("mail.smtp.auth", true);
		props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.ssl.socketFactory", sf);
		
		Session session=Session.getInstance(props, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(sender, auth_code);
			}
			
		});
		
		try {
			Message message=new MimeMessage(session);
			message.setFrom(new InternetAddress(sender));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("剑鱼论坛测试报告");
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText("test");
			
			Transport.send(message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}