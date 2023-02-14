package design.pattern.behavioral.command;

// Command interface
interface Command {
    void execute();
}

// Concrete Command
class MoveCommand implements Command {
    private Tank tank;
    private int x, y;

    public MoveCommand(Tank tank, int x, int y) {
        this.tank = tank;
        this.x = x;
        this.y = y;
    }

    public void execute() {
        tank.move(x, y);
    }
}

class FireCommand implements Command {
    private Tank tank;

    public FireCommand(Tank tank) {
        this.tank = tank;
    }

    public void execute() {
        tank.fire();
    }
}

// Invoker
class Commander {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}

// Receiver
class Tank {
    private int x, y;

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Tank is moving to (" + x + ", " + y + ")");
    }

    public void fire() {
        System.out.println("Tank is firing!");
    }
}

// Client
public class Client {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Commander commander = new Commander();

        commander.setCommand(new MoveCommand(tank, 10, 20));
        commander.invoke();

        commander.setCommand(new FireCommand(tank));
        commander.invoke();
    }
}
