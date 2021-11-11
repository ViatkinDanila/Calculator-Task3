package com.epam.task3.calculator.postfix.exception;

public class SolutionException extends Exception{
    public SolutionException() {
        super();
    }

    public SolutionException(String message) {
        super(message);
    }

    public SolutionException(String message, Exception e) {
        super(message, e);
    }

    public SolutionException(Exception e) {
        super(e);
    }
}
