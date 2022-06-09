package homework;

import java.util.Scanner;

public class Task03 {

    // Question 3 from http://www.beginwithjava.com/java/methods/questions.html
    public static void main(String[] args) {
        String input = readTextFromConsole();
        int vowelsCount = getVowelsCount(input);
        System.out.println("Vowels count is " + vowelsCount);
    }

    static int getVowelsCount(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (isVowel(text.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }

    static String readTextFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text: ");
        return scanner.nextLine().toLowerCase().replace(" ", "");
    }
}
