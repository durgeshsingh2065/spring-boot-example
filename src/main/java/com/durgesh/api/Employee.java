package com.durgesh.api;

public class Employee {

    private long id;
    private String name;
    private String description;
	
    public Employee() {
    }

    public Employee(long id, String name, String description) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
