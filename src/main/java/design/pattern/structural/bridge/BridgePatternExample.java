package design.pattern.structural.bridge;


interface TankDrive {
    void drive();
}

class TankDriveA implements TankDrive {
    @Override
    public void drive() {
        System.out.println("Driving tank type A");
    }
}

class TankDriveB implements TankDrive {
    @Override
    public void drive() {
        System.out.println("Driving tank type B");
    }
}

abstract class Tank {
    protected TankDrive tankDrive;

    public Tank(TankDrive tankDrive) {
        this.tankDrive = tankDrive;
    }

    abstract void fire();
}

class TankA extends Tank {
    public TankA(TankDrive tankDrive) {
        super(tankDrive);
    }

    @Override
    void fire() {
        System.out.println("Firing tank type A");
    }
}

class TankB extends Tank {
    public TankB(TankDrive tankDrive) {
        super(tankDrive);
    }

    @Override
    void fire() {
        System.out.println("Firing tank type B");
    }
}

public class BridgePatternExample {
    public static void main(String[] args) {
        TankDrive tankDriveA = new TankDriveA();
        Tank tankA = new TankA(tankDriveA);
        tankA.fire();
        tankA.tankDrive.drive();

        TankDrive tankDriveB = new TankDriveB();
        Tank tankB = new TankB(tankDriveB);
        tankB.fire();
        tankB.tankDrive.drive();
    }
}
