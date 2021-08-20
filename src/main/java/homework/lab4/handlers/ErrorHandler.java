package homework.lab4.handlers;

public class ErrorHandler implements HttpRequestCodeHandler{
        @Override
        public void execute() {
            System.out.println("Error handler");
        }
}

