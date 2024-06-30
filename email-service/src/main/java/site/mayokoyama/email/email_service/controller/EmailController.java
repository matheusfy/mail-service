package site.mayokoyama.email.email_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

  @Autowired
  private EmailService emailService;

  @GetMapping
  public ResponseEntity<String> getEmail() {
    return ResponseEntity.ok("Email service is running");
  }

  @PostMapping
  public ResponseEntity<String> sendEmail(@RequestBody EmailRequestDTO emailRequest) {
    emailService.sendEmail(emailRequest);
    return ResponseEntity.ok("OK");
  }
}