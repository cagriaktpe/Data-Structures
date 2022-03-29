package com.sametcagriaktepe;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    /* attributes */
    private LinkedList<Employee> stack;

    /* constructors */
    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    /* other methods */
    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
