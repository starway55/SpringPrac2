package yun.com.prac.springPrac2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yunzhao on 14/11/18.
 */
@Component
public class ConstructorInjectionImpl {

    private PrintLogic printLogic;

    @Autowired
    public ConstructorInjectionImpl( PrintLogic printLogic ){

        this.printLogic = printLogic;
    }

    public void printMessage() {

        printLogic.printMessage(PrintType.CONSTRUCTOR_INJECTION);
    }


}
