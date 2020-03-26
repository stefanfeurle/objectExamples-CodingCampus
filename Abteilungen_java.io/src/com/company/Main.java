package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.FileVisitResult;

//C:\Users\DCV\stefan\IdeaProjects\CodingCampus\Objekte

public class Main {

    public static void main(String[] args) {
        Person[] personArr = new Person[20];
        int personCounter  = 0;
        Department[] departmentArr = new Department[20];
        int departmentCounter = 0;
        int whileCounter = 0;
        File departmentFile = new File("C:\\Users\\DCV\\stefan\\IdeaProjects\\CodingCampus\\Objekte\\Abteilungen.txt");
        //System.out.println(departmentFile.exists());
        try{
            FileReader fileReader = new FileReader(departmentFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                whileCounter++;
                if (whileCounter > 1) {
                    String[] splittedValues = line.split(";");

                    String name = splittedValues[0];
                    String departmentName = splittedValues[1];

                    Person person = new Person(name.trim());
                    personArr[personCounter] = person;
                    personCounter++;

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
                    }
                }
            }
        }catch (Exception ex) {
            System.out.println("Error");
        }
        System.out.println();
        for (int i = 0; i < departmentCounter; i++) {
            if (departmentArr[i] != null) {
                System.out.println(departmentArr[i].name);
            }
            for (int j = 0; j < departmentArr[i].employeeArr.length; j++) {
                if (departmentArr[i].employeeArr[j] != null) {
                    System.out.println("\t" + departmentArr[i].employeeArr[j].name);
                }
            }
        }
    }
}
