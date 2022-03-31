package com.sametcagriaktepe;



public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jone", 1);
        Employee frankCastle = new Employee("Frank", "Castle", 2);
        Employee georgeWashington = new Employee("George", "Washington", 3);
        Employee barackObama = new Employee("Barack", "Obama", 4);
        Employee donaldTrump = new Employee("Donald", "Trump", 5);
        Employee joeBiden = new Employee("Joe", "Biden", 7);

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(janeJones);
        queue.add(frankCastle);
        queue.add(georgeWashington);
        queue.add(barackObama);
        queue.add(donaldTrump);
        queue.add(joeBiden);

        queue.printQueue();

        System.out.println("====================");
        queue.remove();
        queue.printQueue();

        System.out.println("====================");
        System.out.println(queue.peek());

    }
}
