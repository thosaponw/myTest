import org.zkoss.bind.annotation.*;

public class HelloViewModel {
    private String message;
    public String getMessage() {
        return message;
    }

    public String getMold() {
        return "month";
    }

    @Command @NotifyChange("message")
    public void showHello() {
        message = "Hello World!";
    }
}