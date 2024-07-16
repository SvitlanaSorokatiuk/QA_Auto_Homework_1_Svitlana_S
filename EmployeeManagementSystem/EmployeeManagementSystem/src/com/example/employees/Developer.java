package com.example.employees;

public class Developer extends Employee {

    public Developer (String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println("Програміст пише код");
    }

    @Override
    public void describeRole() {
        System.out.println("Програміст відповідає за розробку програмного забезпечення");
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Програміст відповідає за розробку програмного забезпечення, а також " + extraInfo);
    }
}
