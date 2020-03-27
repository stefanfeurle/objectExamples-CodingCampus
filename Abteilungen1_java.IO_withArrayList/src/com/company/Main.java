package com.company;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Department> departmentArrL = new ArrayList<>();
        int lineCounter = 0;
        File departmentFile = new File("C:\\Users\\DCV\\stefan\\IdeaProjects\\CodingCampus\\Objekte\\Abteilungen1.txt");

        try {
            FileReader fileReader = new FileReader(departmentFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while((line = bufferedReader.readLine()) != null) {
                lineCounter++;
                if (lineCounter > 1) {
                    String[] splitValueArr = line.split(";");
                    String parentDepartmentName = null;

                    String name = splitValueArr[0];
                    String departmentName = splitValueArr[1];
                    if (splitValueArr.length == 3) {
                        parentDepartmentName = splitValueArr[2];
                    }

                    Person person = new Person(name.trim());
                    Department department = new Department(departmentName.trim());

                    //if (!departmentArrL.contains(department)) {  ....  ist nicht gegangen, vermutlich wegen der person?
                    boolean isSameDepartment = false;
                    for(int i = 0; i < departmentArrL.size(); i++){
                        if (departmentArrL.get(i) != null) {     /// .... ist diese Zeile überhaupt notwendig in einer ArrayList, gibt es überhaupt leere "Fächer in einer ArrayList"?
                            if (departmentArrL.get(i).name.equalsIgnoreCase(department.name)){
                                isSameDepartment = true;
                                departmentArrL.get(i).setDepartmentForEmployee(person);
                            }
                        }
                    }
                    if (!isSameDepartment) {
                        departmentArrL.add(department);
                        department.setDepartmentForEmployee(person);
                        if (parentDepartmentName != null) {
                            for (int i = 0; i < departmentArrL.size(); i++) {
                                if (departmentArrL.get(i).name.equalsIgnoreCase(parentDepartmentName)) {
                                    departmentArrL.get(i).addSubDepartment(department);
                                }
                            }
                        }
                    }
                }
            }
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        departmentArrL.get(0).printOrganizationChartWithEmployee();
    }
}
