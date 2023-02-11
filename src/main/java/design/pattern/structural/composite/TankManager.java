package design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

//抽象坦克组件类
abstract class TankComponent {
    protected String name;

    public TankComponent(String name) {
        this.name = name;
    }

    public abstract void add(TankComponent component);
    public abstract void remove(TankComponent component);
    public abstract void display();
}

//具体坦克组件类
class T1 extends TankComponent {
    private List<TankComponent> components = new ArrayList<>();

    public T1(String name) {
        super(name);
    }

    @Override
    public void add(TankComponent component) {
        components.add(component);
    }

    @Override
    public void remove(TankComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("T1: " + name);
        for (TankComponent component : components) {
            component.display();
        }
    }
}

public class TankManager {
    public static void main(String[] args) {
        TankComponent tankComponent = new T1("tank T1 components needed");
        tankComponent.add(new T1("engine"));
        tankComponent.add(new T1("wheels"));
        tankComponent.add(new T1("gun"));
        tankComponent.add(new T1("engine"));
    }

}
