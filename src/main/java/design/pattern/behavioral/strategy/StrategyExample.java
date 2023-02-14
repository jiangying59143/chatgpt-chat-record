package design.pattern.behavioral.strategy;

interface Strategy {
    int doOperation(int num1, int num2);
}

class AdditionStrategy implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class SubtractionStrategy implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

public class StrategyExample {
    public static void main(String[] args) {
        Context context = new Context(new AdditionStrategy());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new SubtractionStrategy());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }
}
