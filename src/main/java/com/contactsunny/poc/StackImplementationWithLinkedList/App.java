package com.contactsunny.poc.StackImplementationWithLinkedList;

import com.contactsunny.poc.StackImplementationWithLinkedList.stack.Stack;

public class App {

    public static void main(String[] args) {

        stringStackExample();

        integerStackExample();

    }

    private static void integerStackExample() {

        System.out.println("--------------------------------------------------------------");

        System.out.println("Integer stack demo");

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        Integer firstValue = stack.peek();
        System.out.println("Value from peek(): " + firstValue);

        Integer value = stack.pop();
        System.out.println("Popped value: " + value);

        stack.push(4);

        stack.printStack();

        stack.push(5);
        stack.push(6);
        stack.push(7);

        stack.printStack();

        stack.flush();

        stack.printStack();

        System.out.println("--------------------------------------------------------------");
    }

    private static void stringStackExample() {

        System.out.println("--------------------------------------------------------------");

        System.out.println("String stack demo");

        Stack<String> stack = new Stack<String>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        String firstValue = stack.peek();
        System.out.println("Value from peek(): " + firstValue);

        String value = stack.pop();
        System.out.println("Popped value: " + value);

        stack.push("Fourth");

        stack.printStack();

        stack.push("Fifth");
        stack.push("Sixth");
        stack.push("Seventh");

        stack.printStack();

        stack.flush();

        stack.printStack();

        System.out.println("--------------------------------------------------------------");
    }
}
