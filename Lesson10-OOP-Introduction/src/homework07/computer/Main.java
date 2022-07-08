package homework07.computer;

public class Main {

    public static void main(String[] args) {
        Computer pc = new Computer(5000, false, 1000, 16, "Windows");
        Computer laptop = new Computer(4000, true, 500, 12, "macOS");

        pc.printInfo();
        laptop.printInfo();

        pc.useMemory(8);
        laptop.useMemory(10);

        pc.changeOperationSystem("Linux");
        laptop.changeOperationSystem("Haha");

        pc.printInfo();
        laptop.printInfo();
    }
}
