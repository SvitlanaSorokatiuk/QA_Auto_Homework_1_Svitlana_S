package com.example.employees;

public class Designer extends Employee {

    public Designer (String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println("Дизайнер розробляє графічний інтерфейс");
    }

    @Override
    public void describeRole() {
        System.out.println("Дизайнер відповідає за зручність користування сайтом");
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Дизайнер відповідає за зручність користування сайтом, а також " + extraInfo);
    }
}
