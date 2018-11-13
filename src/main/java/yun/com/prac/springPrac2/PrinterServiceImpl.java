package yun.com.prac.springPrac2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yunzhao on 13/11/18.
 */
@Component
public class PrinterServiceImpl implements PrinterService{

    @Autowired
    private PrintLogic printLogic;

    @Override
    public void printMotto() {
        System.out.println("Hello Spring Annotation!");
    }

    @Override
    public void printMessage() {

        printLogic.print();
    }
}
