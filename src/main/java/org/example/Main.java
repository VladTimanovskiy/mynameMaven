package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vladislav", "Timanovskyi");
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}

class Person {
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

}