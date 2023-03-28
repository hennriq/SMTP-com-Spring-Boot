package com.poc.smtp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poc.smtp.dto.EmailSenderDTO;
import com.poc.smtp.service.EmailService;

@Controller
public class EmailSenderController {

	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "/enviar-email", method = RequestMethod.POST, produces = { "application/json" })
	public @ResponseBody void sendEmailtoClient(@RequestBody EmailSenderDTO emailSenderDTO, HttpServletRequest request) {
		emailService.sendSimpleMessage(emailSenderDTO);
	}
}
