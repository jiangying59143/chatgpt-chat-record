package design.pattern.behavioral.interpreter;

import java.util.Stack;

interface Expression {
    public boolean interpret(String context);
}

class TerminalExpression implements Expression {
    private String literal = null;
    public TerminalExpression(String str) {
        literal = str;
    }
    public boolean interpret(String context) {
        if (context.contains(literal)) {
            return true;
        }
        return false;
    }
}

class OrExpression implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;
    public OrExpression(Expression exp1, Expression exp2) {
        expression1 = exp1;
        expression2 = exp2;
    }
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}

class AndExpression implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;
    public AndExpression(Expression exp1, Expression exp2) {
        expression1 = exp1;
        expression2 = exp2;
    }
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}

public class InterpreterPatternExample {
    public static void main(String[] args) {
        String context = "John is male";
        Expression isMale = getMaleExpression();
        System.out.println("John is male? " + isMale.interpret(context));
        context = "Julie is a married woman";
        Expression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret(context));
    }
    public static Expression getMaleExpression() {
        Expression john = new TerminalExpression("John");
        Expression male = new TerminalExpression("male");
        return new OrExpression(john, male);
    }
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("married");
        Expression woman = new TerminalExpression("woman");
        return new AndExpression(julie, new AndExpression(married, woman));
    }
}