package org.example.server.repository;

import org.example.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact(1, "Tom", "+380994453344"));
        list.add(new Contact(2, "Alice", "+38096555444333"));
        list.add(new Contact(3, "Bob", "+380669993377"));
        return list;
    }
}
