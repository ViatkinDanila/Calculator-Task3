package com.epam.task3.calculator;

import com.epam.task3.calculator.postfix.convertation.Convertation;
import com.epam.task3.calculator.postfix.convertation.impl.Solution;
import com.epam.task3.calculator.postfix.exception.PostfixParserException;
import com.epam.task3.calculator.postfix.exception.SolutionException;
import com.epam.task3.calculator.postfix.parser.PostfixParser;
import com.epam.task3.calculator.postfix.parser.impl.PostfixParserImpl;

import java.util.Scanner;

public class Calculator {
    public static int calculate(String mathExpression) throws PostfixParserException, SolutionException {
        Convertation solution = new Solution();
        PostfixParser parser = new PostfixParserImpl();
        return solution.evaluatePostfix(parser.infixToPostfix(mathExpression));
    }
}
