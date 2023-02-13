package design.pattern.structural.facade;

import design.pattern.structural.Tank;
import design.pattern.structural.TankImplementor;
import design.pattern.structural.decorator.ShieldDecorator;

class T1Implementor implements TankImplementor {
    @Override
    public void fire() {
        System.out.println("T1 fire");
    }
}

class T1 extends Tank {
    public T1(TankImplementor implementor) {
        super(implementor);
    }

    @Override
    public void fire() {
        implementor.fire();
    }
}

//外观类
public class TankFacade {
    private T1 t1;
    private ShieldDecorator shieldDecorator;

    public TankFacade() {
        t1 = new T1(new T1Implementor());
        shieldDecorator = new ShieldDecorator(t1);
    }

    public void fire() {
        shieldDecorator.fire();
    }
}
