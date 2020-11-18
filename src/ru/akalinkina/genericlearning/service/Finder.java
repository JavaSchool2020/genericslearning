package ru.akalinkina.genericlearning.service;

import ru.akalinkina.common.model.Person;

import java.util.Collection;
import java.util.Iterator;

public abstract class Finder<V, K> {
    public Person find(Collection<V> collection) {
        K sought;
        Person person = null;
        if (collection != null && !collection.isEmpty()) {
            Iterator<V> iterator = collection.iterator();
            V element = iterator.next();
            person = getPerson(element);
            sought = getValue(element);
            while(iterator.hasNext()) {
                V current = iterator.next();
                K currentValue = getValue(current);
                if (isHeavier(currentValue, sought)) {
                    sought = currentValue;
                    person = getPerson(current);
                }
            }
        }
        return person;
    }

    protected abstract K getValue(V element);

    protected abstract boolean isHeavier(K k1, K k2);

    protected abstract Person getPerson(V element);
}
