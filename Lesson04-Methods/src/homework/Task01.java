package homework;

public class Task01 {

    // Question 1 from http://www.beginwithjava.com/java/methods/questions.html
    public static void main(String[] args) {
        System.out.println("Sum of 2 and 3 is " + getTotal(2, 3));
        System.out.println("Sum of 5 and 6 is " + getTotal(5, 6));
        System.out.println("Sum of 10 and 123 is " + getTotal(10, 123));
    }

    static int getTotal(int a, int b) {
        return a + b;
    }
}
