package Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import services.MessageService;

@Configuration
@ComponentScan(basePackages = "services")
public class AppConfig {
    @Bean
    public String Message() {
        return "Hello from context!";
    }

    @Bean
    public MessageService messageService() {
        return new MessageService(Message());
    }

}
