package com.epam.task3.calculator.postfix.parser.impl;

import com.epam.task3.calculator.postfix.exception.PostfixParserException;

import java.util.Stack;

public class PostfixParserImpl implements com.epam.task3.calculator.postfix.parser.PostfixParser {
    // A utility function to return
    // precedence of a given operator
    // Higher returned value means
    // higher precedence
    public int Prec(char ch) {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

        }
        return -1;
    }

    // The main method that converts
    // given infix expression
    // to postfix expression.
    @Override
    public String infixToPostfix(String exp) throws PostfixParserException {
        // initializing empty String for result
        String result = new String("");

        // initializing empty stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

                // If the scanned character is an '(',
                // push it to the stack.
            else if (c == '(')
                stack.push(c);

                //  If the scanned character is an ')',
                // pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty() &&
                        stack.peek() != '(')
                    result += stack.pop();

                stack.pop();
            } else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c)
                        <= Prec(stack.peek())) {

                    result += stack.pop();
                }
                stack.push(c);
            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '('){
                throw new PostfixParserException();
            }
            result += stack.pop();
        }
        return result;
    }
}
