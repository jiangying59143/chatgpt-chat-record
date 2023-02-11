**说明：**

    TankDrive 接口定义了坦克的驾驶行为。
    TankDriveA 和 TankDriveB 分别实现了 TankDrive 接口，表示不同的驾驶方式。
    Tank 抽象类作为桥接的抽象类，定义了与驾驶相关的抽象方法。
    TankA 和 TankB 是具体的坦克类，实现了不同的开火行为。

**通过抽象类 Tank 和接口 TankDrive 的聚合关系，实现了坦克的驾驶方式与开火行为之间的解耦，在不修改 Tank 和 TankDrive 的情况下可以动态改**