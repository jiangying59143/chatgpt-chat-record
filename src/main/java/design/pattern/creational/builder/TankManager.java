package design.pattern.creational.builder;

public class TankManager {
    public static void main(String[] args) {
        Tank tank = new TankBuilder()
                .setEngine("Diesel engine")
                .setGun("120mm gun")
                .setTurret("360 degree rotating turret")
                .setWheels("Tracked wheels")
                .build();

        System.out.println("Engine: " + tank.getEngine());
        System.out.println("Gun: " + tank.getGun());
        System.out.println("Turret: " + tank.getTurret());
        System.out.println("Wheels: " + tank.getWheels());
    }
}

class TankBuilder {
    private Tank tank = new Tank();

    public TankBuilder setEngine(String engine) {
        tank.setEngine(engine);
        return this;
    }

    public TankBuilder setGun(String gun) {
        tank.setGun(gun);
        return this;
    }

    public TankBuilder setWheels(String wheels) {
        tank.setWheels(wheels);
        return this;
    }

    public TankBuilder setTurret(String turret) {
        tank.setTurret(turret);
        return this;
    }

    public Tank build() {
        return tank;
    }
}

class Tank {
    private String engine;
    private String gun;
    private String wheels;
    private String turret;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getTurret() {
        return turret;
    }

    public void setTurret(String turret) {
        this.turret = turret;
    }
}
