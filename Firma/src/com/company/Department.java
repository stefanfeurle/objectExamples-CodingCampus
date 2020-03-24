package com.company;

public class Department {

    String name;
    //String firstName;
    // String lastName;
    int hierarchyLevel;
    //String gender;
    Person chief;
    Department[] subDepartmentArray = new Department[20];
    int subDepartmentCounter = 0;
    Person[] employeeArray = new Person[20];
    int employeecounterforArray;
    int employeecounterReal;
    Department parent;
    boolean isPrinted = false;


    /*public Department(String name, int hierarchyLevel, String firstName, String lastName, String gender ) {
        this.name = name;
        this.hierarchyLevel= hierarchyLevel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }*/

    public Department(String name, int hierarchyLevel, Person chief) {
        this.name = name;
        this.hierarchyLevel = hierarchyLevel;
        this.chief = chief;
    }

    public void addSubDepartment(Department subDepartment) {
        subDepartmentArray[subDepartmentCounter] = subDepartment;
        subDepartmentCounter++;
    }


    public void getOrganizationChart() {
        if (hierarchyLevel == 1) {
            System.out.println(this.name + " (" + this.chief.firstName + " " + this.chief.lastName + ")");
        } else if (hierarchyLevel > 1) {
            for (int i = 0; i < hierarchyLevel - 1; i++) {
                System.out.print("\t");
            }
            System.out.println("|");
            for (int i = 0; i < hierarchyLevel - 1; i++) {
                System.out.print("\t");
            }
            System.out.print("|_ " + this.name + " (");
            if (chief.gender.equalsIgnoreCase("w")) {
                System.out.println("Leiterin: " + this.chief.firstName + " " + this.chief.lastName + ")");
            } else if (chief.gender.equalsIgnoreCase("m")) {
                System.out.println("Leiter: " + this.chief.firstName + " " + this.chief.lastName + ")");
            }
        }
        for (int i = 0; i < this.subDepartmentCounter; i++) {
            this.subDepartmentArray[i].getOrganizationChart();
        }
    }

    public void getOrganizationChartWithEmployee() {

        if (hierarchyLevel > 1) {
            for (int i = 0; i < hierarchyLevel - 1; i++) {
                System.out.print("\t");
            }
            System.out.println("|\t");
        }
        for (int i = 0; i < hierarchyLevel - 1; i++) {
            System.out.print("\t");
        }
        if (hierarchyLevel == 1) {
            if (chief.gender.equalsIgnoreCase("w")) {
                System.out.println(this.name + " (Frau " + this.chief.firstName + " " + this.chief.lastName + ")");
            } else if (chief.gender.equalsIgnoreCase("m")) {
                System.out.println(this.name + " (Herr " + this.chief.firstName + " " + this.chief.lastName + ")");
            }
        } else if (hierarchyLevel>1) {
            System.out.print("|_ " + this.name + " (");
            if (chief.gender.equalsIgnoreCase("w")) {
                System.out.println("Leiterin: Frau " + this.chief.firstName + " " + this.chief.lastName + ")");
            } else if (chief.gender.equalsIgnoreCase("m")) {
                System.out.println("Leiter: Herr " + this.chief.firstName + " " + this.chief.lastName + ")");
            }
        }
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                for (int j = 0; j < hierarchyLevel; j++) {
                    System.out.print("\t");
                }
                System.out.println("\t" + employeeArray[i].firstName + " " + employeeArray[i].lastName);
            }
        }
        for (int i = 0; i < this.subDepartmentCounter; i++) {
            this.subDepartmentArray[i].getOrganizationChartWithEmployee();
        }
    }
    public void getOrganizationChartWithEmployee(Department department, boolean topLevelPrinted) {

        if (hierarchyLevel == 2 && !topLevelPrinted) {
            for (int i = 0; i < department.employeeArray.length; i++) {
                if (department.employeeArray[i] != null) {
                    for (int j = 0; j < hierarchyLevel - 1; j++) {
                        System.out.print("\t");
                    }
                    System.out.println("|\t" + department.employeeArray[i].firstName + " " + department.employeeArray[i].lastName);
                }
            }
            for (int i = 0; i < hierarchyLevel - 1; i++) {
                System.out.print("\t");
            }
            System.out.println("|\t");
            topLevelPrinted = true;
        }

        if (hierarchyLevel > 2 && department != null) {
            for (int i = 0; i < department.employeeArray.length; i++) {
                if (department.employeeArray[i] != null) {
                    for (int j = 0; j < hierarchyLevel - 1; j++) {
                        System.out.print("\t");
                    }
                    System.out.println("|\t" + department.employeeArray[i].firstName + " " + department.employeeArray[i].lastName);
                }
            }
            for (int i = 0; i < hierarchyLevel - 1; i++) {
                System.out.print("\t");
            }
            System.out.println("|\t");
        }
        for (int i = 0; i < hierarchyLevel - 1; i++) {
            System.out.print("\t");
        }
        if (hierarchyLevel == 1) {
            if (chief.gender.equalsIgnoreCase("w")) {
                System.out.println(this.name + " (Frau " + this.chief.firstName + " " + this.chief.lastName + ")");
            } else if (chief.gender.equalsIgnoreCase("m")) {
                System.out.println(this.name + " (Herr " + this.chief.firstName + " " + this.chief.lastName + ")");
            }
        } else if (hierarchyLevel>1) {
            System.out.print("|_ " + this.name + " (");
            if (chief.gender.equalsIgnoreCase("w")) {
                System.out.println("Leiterin: Frau " + this.chief.firstName + " " + this.chief.lastName + ")");
            } else if (chief.gender.equalsIgnoreCase("m")) {
                System.out.println("Leiter: Herr " + this.chief.firstName + " " + this.chief.lastName + ")");
            }
        }
        department = this;
        for (int i = 0; i < this.subDepartmentCounter; i++) {
            this.subDepartmentArray[i].getOrganizationChartWithEmployee(department,topLevelPrinted);
        }
        if ((department.name.equalsIgnoreCase("Einkauf Übersee"))
            || (department.name.equalsIgnoreCase("Vertrieb Firmenkunden"))){
            for (int i = 0; i < department.employeeArray.length; i++) {
                if (department.employeeArray[i] != null) {
                    for (int j = 0; j < hierarchyLevel - 1; j++) {
                        System.out.print("\t");
                    }
                    System.out.println(" \t" + department.employeeArray[i].firstName + " " + department.employeeArray[i].lastName);
                }
            }
        }
    }


    public void changeChief(Person person) {
        this.chief = person;
    }

    public void switchDepartmentForEmployee(Person person, Department aimDepartment) {
        aimDepartment.employeeArray[aimDepartment.employeecounterforArray] = person;
        this.employeeArray[person.employeeArrayPosition] = null;
        this.employeecounterReal--;
        person.employeeArrayPosition = aimDepartment.employeecounterforArray;
        aimDepartment.employeecounterforArray++;
        aimDepartment.employeecounterReal++;
    }

    public void setDepartmentForNewEmployee(Person person) {
        this.employeeArray[employeecounterforArray] = person;
        person.employeeArrayPosition = employeecounterforArray;
        employeecounterforArray++;
        employeecounterReal++;
    }

    public void printEmployedInDepartment() {
        System.out.println("Im " + this.name + " sind " + this.employeecounterReal + " Mitarbeiter beschäftigt unter der" +
                " Leitung von " + this.chief.firstName + " " + this.chief.lastName + "!");
    }
}

