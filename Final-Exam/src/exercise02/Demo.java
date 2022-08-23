package exercise02;

public class Demo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Size of stack = " + stack.size());
        System.out.println("Empty = " + stack.isEmpty());

        for (int i = 1; i <= 10; i++) {
            stack.push(i * 3);
        }
        System.out.println("Size = " + stack.size());

        System.out.println("All elements in stack");
        stack.showAllElements();

        System.out.println("Pop = " + stack.pop());
        System.out.println("Pop = " + stack.pop());
        System.out.println("Pop = " + stack.pop());
        System.out.println("Pop = " + stack.pop());
        System.out.println("Pop = " + stack.pop());
        System.out.println("Pop = " + stack.pop());
        System.out.println("Size = " + stack.size());

        stack.showAllElements();

        System.out.println("Size = " + stack.size());

        System.out.println("Peek = " + stack.peek());
        System.out.println("Empty = " + stack.isEmpty());
    }
}
