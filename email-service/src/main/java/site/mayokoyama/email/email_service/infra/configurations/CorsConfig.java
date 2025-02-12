package site.mayokoyama.email.email_service.infra.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

  private String siteAddress = System.getenv("SITE_ADDRESS");

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOrigins(siteAddress)
        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
  }
}
