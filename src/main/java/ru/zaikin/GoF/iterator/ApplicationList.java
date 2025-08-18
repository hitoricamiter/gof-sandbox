package ru.zaikin.GoF.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ApplicationList implements ApplicationCollection {

    private List<Application> applications = new ArrayList<>();

    public void add(Application application) {
        applications.add(application);
    }

    @Override
    public ApplicationIterator createIterator() {
        return new ListIterator();
    }

    private class ListIterator implements ApplicationIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < applications.size();
        }

        @Override
        public Application next() {
            return applications.get(index++);
        }
    }
}
