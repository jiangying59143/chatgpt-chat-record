package design.pattern.creational.abstract_factory;

public class TankManager {
    private TankFactory tankFactory;

    public TankManager(TankFactory tankFactory) {
        this.tankFactory = tankFactory;
    }

    public Tank createTank() {
        return tankFactory.createTank();
    }
}

interface Tank {
    void fire();
}

interface TankFactory {
    Tank createTank();
}

class LightTank implements Tank {
    @Override
    public void fire() {
        System.out.println("Light tank fires");
    }
}

class HeavyTank implements Tank {
    @Override
    public void fire() {
        System.out.println("Heavy tank fires");
    }
}

class LightTankFactory implements TankFactory {
    @Override
    public Tank createTank() {
        return new LightTank();
    }
}

class HeavyTankFactory implements TankFactory {
    @Override
    public Tank createTank() {
        return new HeavyTank();
    }
}
