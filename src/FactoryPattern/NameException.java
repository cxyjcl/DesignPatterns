package FactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class NameException extends RuntimeException{
    public NameException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
