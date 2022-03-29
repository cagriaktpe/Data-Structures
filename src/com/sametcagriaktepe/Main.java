package com.sametcagriaktepe;



public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jone", 1);
        Employee frankCastle = new Employee("Frank", "Castle", 2);
        Employee georgeWashington = new Employee("George", "Washington", 3);
        Employee barackObama = new Employee("Barack", "Obama", 4);
        Employee donaldTrump = new Employee("Donald", "Trump", 5);
        Employee joeBiden = new Employee("Joe", "Biden", 7);

        LinkedStack stack = new LinkedStack();

        stack.push(janeJones);
        stack.push(frankCastle);
        stack.push(joeBiden);

        stack.printStack();

        System.out.println("====================");

        stack.pop();

        stack.printStack();

    }
}
