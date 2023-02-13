package design.pattern.structural;

public abstract class Tank {
    public TankImplementor implementor;

    public Tank(TankImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void fire();
}
