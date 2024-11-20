package com.library.model;

public abstract class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}