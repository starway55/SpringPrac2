package yun.com.prac.springPrac2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yunzhao on 14/11/18.
 */

@Component
public class SetterInjectionImpl {

    private PrintLogic printLogic;

    @Autowired
    public void setPrintLogic(PrintLogic printLogic) {
        this.printLogic = printLogic;
    }

    public void printMessage(){

        printLogic.printMessage(PrintType.SETTER_INJECTION);
    }
}
