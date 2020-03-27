package com.company;

import java.util.ArrayList;

public class Department {
    String name;
    ArrayList<Person> employeeArrL = new ArrayList<>();
    ArrayList<Department> subDepartmentArrL = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void setDepartmentForEmployee(Person person) {
        this.employeeArrL.add(person);
    }

    public void addSubDepartment(Department department) {
        this.subDepartmentArrL.add(department);
    }

    public void printOrganizationChartWithEmployee() {
        System.out.println("\n" + this.name.toUpperCase());
        for (int j = 0; j < this.employeeArrL.size(); j++) {
            if (this.employeeArrL.get(j) != null) {
                System.out.println( "  + " + this.employeeArrL.get(j).name);
            }
        }
        System.out.println();
        String tabString = "";
        this.printSubDepartmentChartWithEmployee(tabString);
    }

    public void printSubDepartmentChartWithEmployee(String tabString) {
        tabString = tabString + "\t";
        for (int i = 0; i < subDepartmentArrL.size(); i++) {
            if (subDepartmentArrL.get(i) != null) {
                System.out.println(tabString + subDepartmentArrL.get(i).name.toUpperCase());
                for (int j = 0; j < subDepartmentArrL.get(i).employeeArrL.size(); j++) {
                    if (subDepartmentArrL.get(i).employeeArrL.get(j) != null) {
                        System.out.println(tabString + "  + " + subDepartmentArrL.get(i).employeeArrL.get(j).name);
                    }
                }
                System.out.println();
                subDepartmentArrL.get(i).printSubDepartmentChartWithEmployee(tabString);
            }
        }
    }
}
