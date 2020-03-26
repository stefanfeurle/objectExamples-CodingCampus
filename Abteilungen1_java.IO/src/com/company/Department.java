package com.company;

public class Department {
    String name;
    Person[] employeeArr = new Person[20];
    int employeeArrCounter;
    Department[] subDepartmentArr = new Department[10];
    int subDepartmentCounter;

    public Department(String name) {
        this.name = name;
    }

    public void setDepartmentForEmployee(Person person) {
        this.employeeArr[employeeArrCounter] = person;
        employeeArrCounter++;
    }

    public void addSubDepartment(Department subDepartment) {
        this.subDepartmentArr[subDepartmentCounter] = subDepartment;
        subDepartmentCounter++;
    }

    public void printOrganizationChartWithEmployee() {
        System.out.println("\n" + this.name.toUpperCase());
        for (int j = 0; j < this.employeeArr.length; j++) {
            if (this.employeeArr[j] != null) {
                System.out.println( "  + " + this.employeeArr[j].name);
            }
        }
        System.out.println();
        String tabString = "";
        this.print(tabString);
    }

    public void print(String tabString) {
        tabString = tabString + "\t";
        for (int i = 0; i < subDepartmentArr.length; i++) {
            if (subDepartmentArr[i] != null) {
                System.out.println(tabString + subDepartmentArr[i].name.toUpperCase());
                for (int j = 0; j < subDepartmentArr[i].employeeArr.length; j++) {
                    if (subDepartmentArr[i].employeeArr[j] != null) {
                        System.out.println(tabString + "  + " + subDepartmentArr[i].employeeArr[j].name);
                    }
                }
                System.out.println();
                subDepartmentArr[i].print(tabString);
            }
        }
    }
}
