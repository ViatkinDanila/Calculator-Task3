package com.epam.task3.calculator.postfix.exception;

public class PostfixParserException extends Exception{
    public PostfixParserException() {
        super();
    }

    public PostfixParserException(String message) {
        super(message);
    }

    public PostfixParserException(String message, Exception e) {
        super(message, e);
    }

    public PostfixParserException(Exception e) {
        super(e);
    }
}
