package exercise02;

import java.util.Arrays;
import java.util.Objects;

public class Stack<T> {

    private final static int INITIAL_CAPACITY = 3;
    private final static int START_POSITION = -1;
    private final static String EMPTY_STACK = "Stack is empty!";
    private T[] elements;
    private int index;
    private int position;

    public Stack() {
        this.elements = (T[]) new Object[INITIAL_CAPACITY];
        this.position = START_POSITION;
    }

    public void push(T element) {
        if (index >= elements.length) {
            elements = grow();
        }
        elements[index++] = element;
        position++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException(EMPTY_STACK);
        }
        T el = elements[position];
        elements[position] = null;
        position--;
        index--;
        return el;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException(EMPTY_STACK);
        }
        return elements[position];
    }

    public boolean isEmpty() {
        return position == START_POSITION;
    }

    public long size() {
        return position + 1;
    }

    public void showAllElements() {
        Arrays.stream(elements).filter(Objects::nonNull).forEach(System.out::println);
    }

    private T[] grow() {
        T[] newArr = (T[]) new Object[elements.length * 2];

        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        return newArr;
    }
}
