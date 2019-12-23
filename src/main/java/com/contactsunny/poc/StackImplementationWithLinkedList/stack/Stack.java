package com.contactsunny.poc.StackImplementationWithLinkedList.stack;

public class Stack<T> {

    private Node<T> head;

    public void push(T value) {

        if (this.head == null) {
            this.head = new Node<T>();
            this.head.setData(value);
        } else {
            Node<T> newNode = new Node<T>();
            newNode.setData(value);
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public T pop() {

        T value = null;

        if (this.head != null) {
            value = this.head.getData();

            this.head = this.head.getNext();
        }

        return value;
    }

    public void flush() {
        System.out.println("Flushing stack!");
        this.head = null;
    }

    public T peek() {

        T value = null;

        if (this.head != null) {
            value = this.head.getData();
        }

        return value;
    }

    public void printStack() {

        System.out.println("=====================================");
        System.out.println("Printing stack:");

        if (this.head != null) {
            Node<T> currentNode = this.head;

            while (currentNode != null) {
                System.out.print(currentNode.getData() + " -> ");
                currentNode = currentNode.getNext();
            }

            System.out.println("END");

        } else {
            System.out.println("Stack is empty.");
        }

        System.out.println("=====================================");
    }
}
