package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.IdentityHashMap;

public class Main {

    public static void main(String[] args) {
        Department[] departmentArr = new Department[20];
        int departmentCounter = 0;
        int whileCounter = 0;
        File departmentFile = new File("C:\\Users\\DCV\\stefan\\IdeaProjects\\CodingCampus\\Objekte\\Abteilungen1.txt");

        try {
            FileReader fileReader = new FileReader(departmentFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                whileCounter++;
                if (whileCounter > 1) {
                    String[] splitValueArr = line.split(";");
                    String parentDepartmentName = null;

                    String name = splitValueArr[0];
                    String departmentName = splitValueArr[1];
                    if (splitValueArr.length == 3) {
                        parentDepartmentName = splitValueArr[2];
                    }

                    Person person = new Person(name.trim());
                    Department department = new Department(departmentName.trim());

                    boolean isSameDepartment = false;
                    for (int i = 0; i < departmentArr.length; i++) {
                        if (departmentArr[i] != null) {
                            if (departmentArr[i].name.equals(department.name)) {
                                isSameDepartment = true;
                                departmentArr[i].setDepartmentForEmployee(person);
                            }
                        }
                    }
                    if (!isSameDepartment) {
                        department.setDepartmentForEmployee(person);
                        departmentArr[departmentCounter] = department;
                        departmentCounter++;
                        if (parentDepartmentName != null) {
                            for (int i = 0; i < departmentArr.length; i++) {
                                if (departmentArr[i] != null) {
                                    if (departmentArr[i].name.equalsIgnoreCase(parentDepartmentName.trim())) {
                                        departmentArr[i].addSubDepartment(department);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception ex){
                System.out.println("Error");
        }
        if (departmentArr[0] != null) {
            departmentArr[0].printOrganizationChartWithEmployee();
        }
    }
}
