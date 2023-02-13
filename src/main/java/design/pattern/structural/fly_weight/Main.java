package design.pattern.structural.fly_weight;

import java.util.HashMap;

interface TankImage {
    void display();
}

class ConcreteTankImage implements TankImage {
    private String filename;

    public ConcreteTankImage(String filename) {
        this.filename = filename;
        System.out.println("Loading image from file: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

class TankImageFactory {
    private static final HashMap<String, TankImage> tankImageMap = new HashMap<>();

    public static TankImage getTankImage(String filename) {
        TankImage tankImage = tankImageMap.get(filename);

        if (tankImage == null) {
            tankImage = new ConcreteTankImage(filename);
            tankImageMap.put(filename, tankImage);
        }
        return tankImage;
    }
}

class Tank {
    private TankImage tankImage;

    public Tank(String filename) {
        tankImage = TankImageFactory.getTankImage(filename);
    }

    public void display() {
        tankImage.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Tank tank1 = new Tank("tank.png");
        Tank tank2 = new Tank("tank.png");
        tank1.display();
        tank2.display();
    }
}
