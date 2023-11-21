package interpreter;

import java.util.Stack;

public class DivExpression implements Expression {

    @Override
    public void interpret(Stack<Integer> stack) {
        int aux = stack.pop();
        stack.push(stack.pop() / aux);
    }
}
