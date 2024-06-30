package site.mayokoyama.email.email_service.controller;

public record EmailRequestDTO(String to, String from, String name, String subject, String message) {

}
