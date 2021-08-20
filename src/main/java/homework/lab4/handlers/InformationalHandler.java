package homework.lab4.handlers;

public class InformationalHandler implements HttpRequestCodeHandler{
    @Override
    public void execute() {
        System.out.println("Informational handler");
    }
}
