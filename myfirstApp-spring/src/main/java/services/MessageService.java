package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
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
    public MessageService(String text) {
        this.setMessage(text);
    }

}
