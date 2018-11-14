package yun.com.prac.springPrac2;

import org.springframework.stereotype.Component;

/**
 * Created by yunzhao on 13/11/18.
 */
@Component
public class PrintLogic {

    public void printMessage(PrintType type){

        System.out.println(type.getMessage());
    }

}
