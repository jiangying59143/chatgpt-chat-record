package design.pattern.structural.adapter;

interface Tank {
    public void fire();
}

class OldTank implements Tank {
    public void fire() {
        System.out.println("Old tank firing with low caliber ammunition.");
    }
}

class NewTankAdapter implements Tank {
    private NewTank newTank;
    public NewTankAdapter(NewTank newTank) {
        this.newTank = newTank;
    }
    public void fire() {
        newTank.advancedFire();
    }
}

class NewTank {
    public void advancedFire() {
        System.out.println("New tank firing with high caliber ammunition.");
    }
}

public class AdapterDesignPatternExample {
    public static void main(String[] args) {
        Tank oldTank = new OldTank();
        Tank newTank = new NewTankAdapter(new NewTank());

        System.out.println("Old tank firing: ");
        oldTank.fire();
        System.out.println("New tank firing: ");
        newTank.fire();
    }
}
