package exercise_in_class;

//Write a method that receives String name and int age as parameters.
//        The method should print the following sentence:
//        {name} is {age} old.
//Call the method 3 times with different arguments and see the expected output on the console.

public class Exercise01 {

    public static void main(String[] args) {
        printInfo("Ivan", 19);
        printInfo("Pesho", 23);
        printInfo("Gosho", 33);
    }

    static void printInfo(String name, int age) {
        System.out.printf("%s is %d old.%n", name, age);
    }
}
