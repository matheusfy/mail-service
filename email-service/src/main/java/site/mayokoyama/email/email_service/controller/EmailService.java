package site.mayokoyama.email.email_service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

  @Autowired
  MailSender mailSender;

  private static Logger logger = LoggerFactory.getLogger(EmailService.class);

  public void sendEmail(EmailRequestDTO emailRequest) {

    SimpleMailMessage message = new SimpleMailMessage();
    message.setTo(emailRequest.to());
    message.setSubject(emailRequest.subject());
    message.setText(emailRequest.message());
    message.setFrom(emailRequest.from());
    message.setCc(emailRequest.from());
    logger.info("Sending email to: " + emailRequest.to() + " from: " + emailRequest.from() + " with subject: "
        + emailRequest.subject() + " and message: " + emailRequest.message());
    mailSender.send(message);
  }

}
