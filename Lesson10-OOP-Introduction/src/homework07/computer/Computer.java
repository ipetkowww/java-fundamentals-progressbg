package homework07.computer;

import java.time.LocalDate;

public class Computer {

    int yearOfManufacture;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    int freeMemory;
    String operationSystem;

    public Computer(double price, boolean isNotebook, int hardDiskMemory,
                    int freeMemory, String operatingSystem) {
        // will set the current year when computer object is instantiated
        this.yearOfManufacture = LocalDate.now().getYear();
        setPrice(price);
        this.isNotebook = isNotebook;
        setHardDiskMemory(hardDiskMemory);
        setFreeMemory(freeMemory);
        changeOperationSystem(operatingSystem);
    }

    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    void setHardDiskMemory(int hardDiskMemory) {
        // in our program the smallest hard disk memory will be 256 GB
        int smallestHardDiskMemoryGB = 256;
        this.hardDiskMemory = Math.max(hardDiskMemory, smallestHardDiskMemoryGB);
    }

    void setFreeMemory(int freeMemory) {
        //in our program the smallest free memory will be 4 GB
        int smallestFreeMemoryGB = 4;
        this.freeMemory = Math.max(freeMemory, smallestFreeMemoryGB);
    }

    void changeOperationSystem(String operationSystem) {
        boolean operationSystemSet = false;
        String[] operatingSystems = {"Windows", "Linux", "macOS"};
        for (String os : operatingSystems) {
            if (operationSystem.equals(os)) {
                this.operationSystem = os;
                operationSystemSet = true;
                break;
            }
        }
        if (!operationSystemSet) {
            this.operationSystem = "Operating System is missing";
        }
    }

    void useMemory(int memory) {
        if (memory > freeMemory) {
            System.out.println("Not enough free memory");
        }
        this.freeMemory -= memory;
    }

    void printInfo() {
        String result = this.isNotebook ? "Yes" : "No";
        System.out.println("Year or manufacturer: " + this.yearOfManufacture);
        System.out.println("Price: " + this.price);
        System.out.println("Notebook: " + result);
        System.out.println("Hard Disk Memory: " + this.hardDiskMemory);
        System.out.println("Free Memory: " + this.freeMemory);
        System.out.println("Operation System: " + this.operationSystem);
        System.out.println("=============================================================");
    }

}
