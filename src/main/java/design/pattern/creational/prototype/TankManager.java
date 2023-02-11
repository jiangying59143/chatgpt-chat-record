package design.pattern.creational.prototype;

public class TankManager {
    public static void main(String[] args) {
        Tank prototype = new Tank();
        prototype.setEngine("Diesel engine");
        prototype.setGun("120mm gun");
        prototype.setTurret("360 degree rotating turret");
        prototype.setWheels("Tracked wheels");

        Tank tank = prototype.clone();
        System.out.println("Engine: " + tank.getEngine());
        System.out.println("Gun: " + tank.getGun());
        System.out.println("Turret: " + tank.getTurret());
        System.out.println("Wheels: " + tank.getWheels());

        System.out.println();
        System.out.println(prototype.hashCode() + " " + tank.hashCode());
    }
}

class Tank implements Cloneable {
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

    @Override
    public Tank clone() {
        try {
            return (Tank) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
