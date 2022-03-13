package Machine;

class CarTest {
    boolean isStart;
    boolean isOpenDoor;

    void start() {
        System.out.println("start car");
        isStart = true;
    }

    void turnOff() {
        System.out.println("turn off car");
        isStart = false;
    }

    void openDoor() {
        System.out.println("open the door of  car");
        isOpenDoor = true;
    }

    void closeDoor() {
        System.out.println("close the door of car");
        isOpenDoor = false;
    }

    void run() {
        if (!isOpenDoor && isStart)
            System.out.println("car run....");
        else System.out.println("car int the park");
    }
}