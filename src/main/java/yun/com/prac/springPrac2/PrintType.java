package yun.com.prac.springPrac2;

/**
 * Created by yunzhao on 14/11/18.
 */
public enum PrintType {

    INJECTION_BY_TYPE("Injection by type"),
    CONSTRUCTOR_INJECTION("Constructor injection"),
    SETTER_INJECTION("Setter Injection"),
    GETTER_INJECTION("Getter Injection");

    private String message;

    private PrintType(String message){

        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
