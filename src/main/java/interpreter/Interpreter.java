package interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Interpreter {
    private List<Expression> list = new ArrayList<>();

    public Interpreter(String str) {
        for (String token: str.split(" ")) {
            if (token.equals("+"))
                list.add(new PlusExpression());
            else if (token.equals("-"))
                list.add(new MinusExpression());
            else if (token.equals("*"))
                list.add(new MulExpression());
            else if (token.equals("/"))
                list.add(new DivExpression());
            else
                list.add(new NumberExpression(Integer.valueOf(token)));
        }
    }

    public int evaluate() {
        Stack<Integer> stack = new Stack<>();
        for (Expression e: list)
            e.interpret(stack);
        return stack.pop();
    }
}
