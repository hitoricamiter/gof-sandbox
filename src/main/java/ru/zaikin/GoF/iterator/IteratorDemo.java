package ru.zaikin.GoF.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ApplicationList list = new ApplicationList();
        list.add(new Application("A1", 750));
        list.add(new Application("A2", 680));
        list.add(new Application("A3", 720));

        ApplicationIterator iterator = list.createIterator();

        while (iterator.hasNext()) {
            Application app = iterator.next();
            System.out.println("Application " + app.getId() + ", score: " + app.getScore());
        }
    }
}
