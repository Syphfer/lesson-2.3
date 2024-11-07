package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private HashMap<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (phoneBook.containsKey(surname)) {
            List<String> phoneNumbers = phoneBook.get(surname);
            if (!phoneNumbers.contains(phoneNumber)) {
                phoneNumbers.add(phoneNumber);
                System.out.println("Записан номер " + phoneNumber + " для фамилии " + surname);
            } else {
                System.out.println("Номер " + phoneNumber + " уже существует");
            }
        } else {
            phoneBook.put(surname, new ArrayList<>(Arrays.asList(phoneNumber)));
            System.out.println("Номер " + phoneNumber + " добавлен для фамилии " + surname);
        }
    }

    public List<String> get (String surname) {
        if (phoneBook.containsKey(surname)) {
            System.out.println("Это " + surname);
            return phoneBook.get(surname);

        } else {
            System.out.println("В книге нет номера для фамилии " + surname);
            return new ArrayList<>();
        }
    }
}