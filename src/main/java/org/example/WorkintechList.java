package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<E extends Comparable<E>> extends ArrayList<E> {

    @Override
    public boolean add(E element) {
        if (!contains(element)) {
            return super.add(element);
        }
        return false;
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        boolean sonuc = super.remove(o);
        Collections.sort(this);
        return sonuc;
    }
}