package design.pattern.creational.singleton;

public class TankManager {
    private static TankManager instance;

    private TankManager() {}

    public static TankManager getInstance() {
        if (instance == null) {
            instance = new TankManager();
        }
        return instance;
    }
}