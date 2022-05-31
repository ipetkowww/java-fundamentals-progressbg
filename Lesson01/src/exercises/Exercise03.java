package exercises;

public class Exercise03 {
//    Write a program to test if your first name is equal to your last name. Print the result.
//    Write a program to test if "Java" is equal to "java". What is the result? Why?

    public static void main(String[] args) {
        String myFirstName = "Ivan";
        String myLastName = "Petkov";

        String javaLowerCase = "java";
        String javaUpperCase = "Java";

        System.out.println(myFirstName.equals(myLastName));
        System.out.println(javaLowerCase.equals(javaUpperCase));
    }

}
