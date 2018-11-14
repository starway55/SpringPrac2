package yun.com.prac.springPrac2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yunzhao on 13/11/18.
 */
@Service
public class PrinterServiceImpl implements PrinterService{

    @Autowired // Field Injection.
    private PrintLogic printLogic;

    public PrinterServiceImpl(PrintLogic printLogic){

        this.printLogic = printLogic;
    }

    @Override
    public void printMotto() {
        System.out.println("Hello Spring Annotation!");
    }

    @Override
    public void printMessage() {

        printLogic.printMessage(PrintType.INJECTION_BY_TYPE);
    }
}
