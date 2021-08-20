package homework.lab5.task1.never_use_switch.handlers;

public class HappyBirthdayHandler implements MailHandler{

    @Override
    public void handle() {
        System.out.println("Happy Birthday");
    }
}
