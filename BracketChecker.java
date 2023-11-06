package com.GreatLearning3lab1p;

import java.util.Stack;

public class BracketChecker {
	public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Unbalanced, no corresponding opening bracket
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false; // Mismatched brackets
                }
            }
        }
        
        return stack.isEmpty(); // The stack should be empty for a balanced string
    }
}

