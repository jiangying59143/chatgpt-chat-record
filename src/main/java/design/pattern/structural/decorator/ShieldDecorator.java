package design.pattern.structural.decorator;

abstract class Tank {
    protected TankImplementor implementor;

    public Tank(TankImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void fire();
}

interface TankImplementor {
    void fire();
}
//抽象装饰类
abstract class TankDecorator extends Tank {
    protected Tank tank;

    public TankDecorator(Tank tank) {
        super(tank.implementor);
        this.tank = tank;
    }
}

//具体装饰类
class ShieldDecorator extends TankDecorator {
    public ShieldDecorator(Tank tank) {
        super(tank);
    }

    @Override
    public void fire() {
        System.out.println("Shield on");
        tank.fire();
        System.out.println("Shield off");
    }
}