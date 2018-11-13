package yun.com.prac.springPrac2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPrac2Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringPrac2Application.class, args);

		PrinterService printerService = applicationContext.getBean(PrinterService.class);

		printerService.printMessage();
	}
}
