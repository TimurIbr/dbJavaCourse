package homework.lab4.handlers;

public class SuccessHandler implements HttpRequestCodeHandler{
    @Override
    public void execute() {
        System.out.println("Succes handler");
    }
}
