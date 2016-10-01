package acroquest.java.junit;

public class Greeting {
    public String getMessage(int hour) {
        String message;
        if (hour >= 5 && hour < 11) {
            message = "おはようございます";
        } else if (hour >= 11 && hour < 17) {
            message = "こんにちは";
        } else {
            message = "こんばんは";
        }
        return message;
    }
}