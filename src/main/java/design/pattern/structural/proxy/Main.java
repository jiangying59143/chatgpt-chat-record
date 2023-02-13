package design.pattern.structural.proxy;

interface Tank {
    void fire();
    void move();
}

class TankImpl implements Tank {
    @Override
    public void fire() {
        System.out.println("Tank fires a shot");
    }

    @Override
    public void move() {
        System.out.println("Tank moves forward");
    }
}

class TankProxy implements Tank {
    private Tank tank;

    public TankProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void fire() {
        System.out.println("Checking if the shot is allowed");
        tank.fire();
        System.out.println("Shot fired");
    }

    @Override
    public void move() {
        System.out.println("Checking if the move is allowed");
        tank.move();
        System.out.println("Tank moved");
    }
}

public class Main {
    public static void main(String[] args) {
        Tank tank = new TankImpl();
        Tank proxy = new TankProxy(tank);
        proxy.fire();
        proxy.move();
    }
}
