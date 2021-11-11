package com.epam.task3.calculator.postfix.convertation;

import com.epam.task3.calculator.postfix.exception.SolutionException;

public interface Convertation {
    int evaluatePostfix(String exp) throws SolutionException;
}
