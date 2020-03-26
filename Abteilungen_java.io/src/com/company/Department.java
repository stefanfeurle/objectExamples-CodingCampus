package com.company;

public class Department {
    String name;
    Person[] employeeArr = new Person[20];
    int employeeArrCounter;

    public Department(String name) {
        this.name = name;
    }
    public void setDepartmentForEmployee(Person person) {
        this.employeeArr[employeeArrCounter] = person;
        employeeArrCounter++;
    }
}
