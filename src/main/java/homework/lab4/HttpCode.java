package homework.lab4;

import homework.lab4.handlers.HttpRequestCodeHandler;
import homework.lab4.handlers.SuccessHandler;

import java.util.logging.Handler;

public enum HttpCode {
    SINGLE(1, 2, "холостое", new SuccessHandler());

    private final String statusDesc;
    private final int minCode;
    private final int maxCode;
    public  final HttpRequestCodeHandler handler;

    HttpCode(int minCode, int maxCode, String statusDesc, HttpRequestCodeHandler handler) {
        this.statusDesc = statusDesc;
        this.minCode = minCode;
        this.maxCode = maxCode;
        this.handler = handler;
    }

}
