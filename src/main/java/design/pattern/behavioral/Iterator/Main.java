package design.pattern.behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

class Tank {
    int id;
    String type;
    public Tank(int id, String type) {
        this.id = id;
        this.type = type;
    }
}

interface TankContainer {
    Iterator<Tank> getIterator();
}

class TankFleet implements TankContainer {
    ArrayList<Tank> tanks;
    public TankFleet() {
        tanks = new ArrayList<Tank>();
        addTank(new Tank(1, "Tiger"));
        addTank(new Tank(2, "Panther"));
        addTank(new Tank(3, "Panzer"));
    }
    public void addTank(Tank tank) {
        tanks.add(tank);
    }
    public Iterator<Tank> getIterator() {
        return tanks.iterator();
    }
}

class TankIterator implements Iterator<Tank> {
    int index;
    TankFleet tankFleet;
    public TankIterator(TankFleet tankFleet) {
        this.tankFleet = tankFleet;
    }
    public boolean hasNext() {
        if (index < tankFleet.tanks.size()) {
            return true;
        }
        return false;
    }
    public Tank next() {
        if (this.hasNext()) {
            return tankFleet.tanks.get(index++);
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        TankFleet tankFleet = new TankFleet();
        for (Iterator<Tank> iterator = tankFleet.getIterator(); iterator.hasNext(); ) {
            Tank tank = iterator.next();
            System.out.println("Tank ID: " + tank.id + " Type: " + tank.type);
        }
    }
}
