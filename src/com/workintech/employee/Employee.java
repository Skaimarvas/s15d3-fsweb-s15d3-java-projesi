package com.workintech.employee;

import java.util.Objects;

public class Employee {
    private long id;
    private String firstname;
    private String lastname;

    public Employee(long id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    //unique
    //frequency
    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id ;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);

    }

    @Override
    public String toString() {
        return  "Name: " + firstname + " " + lastname + ", Id: " + id;

    }
}
