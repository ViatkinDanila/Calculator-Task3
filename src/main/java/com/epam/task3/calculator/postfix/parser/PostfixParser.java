package com.epam.task3.calculator.postfix.parser;

import com.epam.task3.calculator.postfix.exception.PostfixParserException;

public interface PostfixParser {
    String infixToPostfix(String exp) throws PostfixParserException;
}
