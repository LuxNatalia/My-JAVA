package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckingBrackets {

    public static boolean checkingBrackets(String string) {
        Deque<Character> deque = new ArrayDeque<>();

        int bracketsIndex = findTheFollowingBracket(string, -1);

        while (bracketsIndex < string.length()) {

            switch (string.charAt(bracketsIndex)) {
                case '(':
                    deque.add(')');
                    bracketsIndex = findTheFollowingBracket(string, bracketsIndex);
                    break;
                case '{':
                    deque.add('}');
                    bracketsIndex = findTheFollowingBracket(string, bracketsIndex);
                    break;
                case '[':
                    deque.add(']');
                    bracketsIndex = findTheFollowingBracket(string, bracketsIndex);
                    break;
                case '<':
                    deque.add('>');
                    bracketsIndex = findTheFollowingBracket(string, bracketsIndex);
                    break;
                case ')':
                case '}':
                case '>':
                case ']': {
                    if (deque.isEmpty() || deque.equals(null)) {
                        return false;

                    } else {
                        if (deque.peekLast().equals(string.charAt(bracketsIndex))) {
                            deque.removeLast();
                            bracketsIndex = findTheFollowingBracket(string, bracketsIndex);
                        } else {
                            return false;

                        }
                    }

                }
                break;
            }

        }

        if (deque.isEmpty() || deque.equals(null)) {
            return true;
        } else {
            return false;
        }

    }


    public static int findTheFollowingBracket(String string, int index) {
        int j = index + 1;
        while (j < string.length() && string.charAt(j) != ')' && string.charAt(j) != '}' && string.charAt(j) != ']' && string.charAt(j) != '>' && string.charAt(j) != '(' && string.charAt(j) != '{' && string.charAt(j) != '[' && string.charAt(j) != '<') {
            j = j + 1;
        }
        return j;
    }

}
