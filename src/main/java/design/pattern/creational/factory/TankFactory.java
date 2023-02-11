package design.pattern.creational.factory;

public class TankFactory {
    public static Tank createTank(String type) {
        switch (type) {
            case "light":
                return new LightTank();
            case "heavy":
                return new HeavyTank();
            default:
                throw new IllegalArgumentException("Invalid tank type");
        }
    }
}

interface Tank {
    void fire();
}

class LightTank implements Tank {
    @Override
    public void fire() {
        System.out.println("LightTank is firing");
    }
}

class HeavyTank implements Tank {
    @Override
    public void fire() {
        System.out.println("HeavyTank is firing");
    }
}
