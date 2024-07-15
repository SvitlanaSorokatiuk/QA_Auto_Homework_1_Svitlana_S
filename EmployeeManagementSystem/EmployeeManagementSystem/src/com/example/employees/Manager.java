package com.example.employees;

public class Manager extends Employee {

    public Manager (String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println("Менеджер організовує роботу працівників компанії");
    }

    @Override
    public void describeRole() {
        System.out.println("Менеджер відповідає за організацію, координацію та контроль роботи компанії");
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Менеджер відповідає за організацію, координацію та контроль роботи компанії, а також " + extraInfo);
    }
}
