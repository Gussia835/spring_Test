import Configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.MessageService;

public class Main {
    public static void main(String[] strings) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService service_message = context.getBean(MessageService.class);
        System.out.println(service_message.getMessage());
        service_message.setMessage("Hello from Main!");
        String text = service_message.getMessage();
        System.out.println(text);
    }
}
