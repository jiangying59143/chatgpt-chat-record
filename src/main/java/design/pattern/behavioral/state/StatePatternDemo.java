package design.pattern.behavioral.state;

interface State {
    void doAction();
}

class StartState implements State {
    @Override
    public void doAction() {
        System.out.println("Tank is starting");
    }
}

class StopState implements State {
    @Override
    public void doAction() {
        System.out.println("Tank is stopped");
    }
}

class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        State state = new StartState();
        state.doAction();

        context.setState(state);
        System.out.println(context.getState().toString());

        state = new StopState();
        state.doAction();

        context.setState(state);
        System.out.println(context.getState().toString());
    }
}
