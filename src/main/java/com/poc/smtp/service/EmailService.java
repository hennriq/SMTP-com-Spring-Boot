package com.poc.smtp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.poc.smtp.dto.EmailSenderDTO;
import com.poc.smtp.helper.TemplateHelper;

@Component
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	private String emailFrom;

	public void sendSimpleMessage(EmailSenderDTO emailSenderDTO) {
		try {
			SimpleMailMessage message = new SimpleMailMessage();

			message.setFrom(emailFrom); // TODO : get from vault
			message.setTo(emailSenderDTO.emailOfficer);
			message.setSubject(emailSenderDTO.subject);
			message.setText(TemplateHelper.buildTemplate(emailSenderDTO));

			javaMailSender.send(message);
		} catch (MailException exception) {
			// TODO : throws SummerException com a msg de erro
		}
	}
}