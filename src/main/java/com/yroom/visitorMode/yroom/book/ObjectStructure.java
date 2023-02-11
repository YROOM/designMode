package com.yroom.visitorMode.yroom.book;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rui.yang
 */
public class ObjectStructure {

    private List<Person> elements = new ArrayList<>();

    public void attach(Person element) {
        elements.add(element);
    }

    public void detach(Person element) {
        elements.remove(element);
    }

    public void disPlay(Action visitor) {
        for (Person person : elements) {
            person.accept(visitor);

        }
    }
}
