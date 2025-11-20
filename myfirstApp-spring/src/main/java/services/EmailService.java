package services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailService implements NotificationService {
    private String text = "";

    //Геттер
    public String getMessage() {
        return this.text;
    }

    //Сеттер
    public void setMessage(@NonNull String text) {
        this.text = (text == null || text.isBlank()) ? "" : text.trim();
    }

    //Конструктор без параметров
    public EmailService(String text) {
        this.setMessage(text);
    }

    //Вывод
    @Override
    public void pushNotification() {
        System.out.println(this.getMessage());
    }
}
