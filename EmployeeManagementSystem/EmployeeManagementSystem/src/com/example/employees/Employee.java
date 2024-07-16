package com.example.employees;

public class Employee {

    //Визначення полів класу
    private String name;
    private int age;
    private int salary;

    //Конструктор
    public Employee (String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //Геттери та сеттери для полів класу
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name.trim();
        } else {
            System.out.println("Поле з іменем працівника не може бути порожнім");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Вік працівника компанії не може бути менше 18 років");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Зарплата праціника компанії не може бути від’ємною або нульовою");
        }
    }

    //Методи
    public void work() {
        System.out.println("Робочий час працівника з 8:00 до 17:00 год.");
    }

    public void takeBreak() {
        System.out.println("Обідня перерва у працівника з 12:00 до 13:00 год.");
    }

    public void performJob() {
        System.out.println("Працівник виконує обов’язки згідно посадової інструкції");
    }

    public void describeRole() {
        System.out.println("Обов’язки працівника залежать від посади, на якій він працює");
    }

    public void describeRole(String extraInfo) {
        System.out.println("Обов’язки працівника залежать від посади, на якій він працює, а також " + extraInfo);
    }
}