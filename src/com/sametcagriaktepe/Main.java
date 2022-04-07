package com.sametcagriaktepe;



public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jone", 1);
        Employee frankCastle = new Employee("Frank", "Castle", 2);
        Employee georgeWashington = new Employee("George", "Washington", 3);
        Employee barackObama = new Employee("Barack", "Obama", 4);
        Employee donaldTrump = new Employee("Donald", "Trump", 5);
        Employee joeBiden = new Employee("Joe", "Biden", 7);

        ArrayQueue queue = new ArrayQueue(5);

        queue.add(janeJones);
        queue.add(frankCastle);
        queue.remove(); //
        queue.add(georgeWashington); //
        queue.remove(); //
        queue.add(barackObama); //
        queue.remove(); //
        queue.add(donaldTrump); //
        queue.remove(); //
        queue.add(janeJones);

        queue.printQueue();

    }
}
