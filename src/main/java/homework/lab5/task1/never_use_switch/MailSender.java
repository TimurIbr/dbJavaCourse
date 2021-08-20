package homework.lab5.task1.never_use_switch;

import homework.lab5.task1.never_use_switch.handlers.HappyBirthdayHandler;
import homework.lab5.task1.never_use_switch.handlers.MailHandler;
import homework.lab5.task1.never_use_switch.handlers.WelcomeHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class MailSender {

    private final static Map<Integer, MailHandler> mailHandlerMap = new HashMap<>();

    static {
        mailHandlerMap.put(1, new WelcomeHandler());
        mailHandlerMap.put(2, new HappyBirthdayHandler());
    }

    public void send(MailInfo mailInfo) {
        mailHandlerMap.get(mailInfo.getMailType()).handle();

//        //todo refactor this to beautiful code
//        if (mailInfo.getMailType() == 1) {
//            //50 lines of code which send welcome mail
//            System.out.println("Welcome mail was sent "+mailInfo.getContext());
//        } else if (mailInfo.getMailType() == 2) {
//            //50 lines of code which send welcome mail
//            System.out.println("Happy Birthdate mail was sent "+mailInfo.getContext());
//        }

    }
}
