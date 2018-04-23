package fi.kajstrom.datastructuresalgorithms;

import java.util.*;

/**
 * Naive linter for linting braces (, {, [ using a stack.
 */
public class BraceLinter {

    private Deque<Character> stack;
    private String error;
    private Map<Character, Character> braces = new HashMap<>();

    public BraceLinter()
    {
        stack = new ArrayDeque<>();
        braces.put(')', '(');
        braces.put(']', '[');
        braces.put('}', '{');
    }

    public void lint(String text)
    {
        stack.clear();
        error = null;

        for (int i = 0; i < text.length(); i++) {
            Character c = text.charAt(i);

            if (isOpeningBracket(c)) {
                stack.push(c);
            }

            if (isClosingBracket(c)) {
                if (isClosingBracketForCurrentHead(c)) {
                    stack.pop();
                } else {
                    error = "Unmatched " + c + " at index " + i;
                    break;
                }
            }
        }

        if (error == null && !stack.isEmpty()) {
            error = "Unclosed " + stack.peek() + ".";
        }
    }

    public String getError()
    {
        return error;
    }

    private boolean isOpeningBracket(Character c) {
        return braces.containsValue(c);
    }

    private boolean isClosingBracket(Character c) {
        return braces.containsKey(c);
    }

    private boolean isClosingBracketForCurrentHead(Character c) {
        if (stack.isEmpty()) {
            return false;
        }

        return braces.get(c).equals(stack.getFirst());
    }
}
