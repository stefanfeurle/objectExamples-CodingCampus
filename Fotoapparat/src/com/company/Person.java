package com.company;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String maidenName;
    String maritalStatus;
    Person partner;
    Person [] childrenArr = new Person[20];
    int childrencounter;
    String lastN;
    int hierarchyLevel;

    public Person(String firstName, String lastName, int age, String gender, int hierarchyLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.hierarchyLevel = hierarchyLevel;
    }
    public String getFamilyTree(String familyTree) {
        for (int i = 0; i < hierarchyLevel; i++) {
            familyTree += "\t";
        }
        familyTree +=  this.firstName + " " + this.lastName;
        if (maidenName != null) {
            familyTree += " (Mädchenname: " + this.maidenName + ")";
        }
        familyTree += "\n";
        for (int i = 0; i < this.childrencounter; i++) {
            familyTree = this.childrenArr[i].getFamilyTree(familyTree);
        }
        return familyTree;
    }
    public void getFamilyTree() {
        for (int i = 0; i < hierarchyLevel; i++) {
            System.out.print("\t");
        }
        System.out.print(this.firstName + " " + this.lastName);
        if (maidenName != null) {
            System.out.print(" (Mädchenname: " + this.maidenName + ")");
        }
        System.out.println();
        for (int i = 0; i < this.childrencounter; i++) {
            this.childrenArr[i].getFamilyTree();

        }
    }
/*
        childrenArr[0].age = 4;
        childrenArr[0].makeChildrens();
        childrenArr[0].childrenArr[0].makeChildrens();
String stammbaum = "";
        getStammbaum(this, stammbaum);
    }

    public void getStammbaum(Person person, String stammbaum)
    {
        for (int i = 0; i < person.childrenArr.length; i++) {
            stammbaum = stammbaum + person.childrenArr[i].firstName;
            getStammbaum(person.childrenArr[i], stammbaum);
        }
    }*/

    public String produceBaby (Person p, String firstName, String gender, int hierarchyLevel) {
        if (!this.gender.equalsIgnoreCase(p.gender)) {
            if (this.gender.equalsIgnoreCase("Frau")) {
                lastN = this.lastName;
            } else if (p.gender.equalsIgnoreCase("Frau")) {
                lastN = p.lastName;
            }
            Person child = new Person(firstName, lastN, 0, gender,hierarchyLevel);
            this.childrenArr[this.childrencounter] = child;
            p.childrenArr[p.childrencounter] = child;
            this.childrencounter++;
            p.childrencounter++;
            String output = "Gratuliere zum Nachwuchs!\n";
            return output;
        }
        else {
            String output = "Menschen gleichen Geschlechts können zwar miteinander Spass haben aber keine Babys bekommen!\n";
            return output;
        }
    }

    public String marry(Person p) {
        if (this != null && p != null
                && !this.gender.equalsIgnoreCase(p.gender)
                //&& this.age >= 18 && p.age >=18
                && (this.maritalStatus == null || !this.maritalStatus.equalsIgnoreCase("married"))
                && (p.maritalStatus == null || !p.maritalStatus.equalsIgnoreCase("married"))) {
            p.maritalStatus = "married";
            this.maritalStatus = "married";
            if (this.gender.equalsIgnoreCase("Frau")) {
                this.maidenName = this.lastName;
                this.lastName = p.lastName;
            }
            else if (p.gender.equalsIgnoreCase("Frau")){
                p.maidenName = p.lastName;
                p.lastName = this.lastName;
            }
            this.partner = p;
            p.partner = this;
            String output = "Gratuliere zur Hochzeit!\n";
            return output;
        }
        else {
            String output = "Die beiden Personen können nicht heiraten!\n";
            return output;
        }
    }

    public static String marry(Person p1, Person p2) {
        if (p1 != null && p2 != null
                && !p1.gender.equalsIgnoreCase(p2.gender)
                //&& p1.age >= 18 && p2.age >=18
                && (p1.maritalStatus == null || !p1.maritalStatus.equalsIgnoreCase("married"))
                && (p2.maritalStatus == null || !p2.maritalStatus.equalsIgnoreCase("married"))) {
            p1.maritalStatus = "married";
            p2.maritalStatus = "married";
            if (p1.gender.equalsIgnoreCase("Frau")) {
                p1.maidenName = p1.lastName;
                p1.lastName = p2.lastName;
            }
            else if (p2.gender.equalsIgnoreCase("Frau")){
                p2.maidenName = p2.lastName;
                p2.lastName = p1.lastName;
            }
            p1.partner = p2;
            p2.partner = p1;
            String output;
            output = "Gratuliere zur Hochzeit!\n";
            return output;
        }
        else {
            //System.out.println("Die beiden Personen können nicht heiraten!");
            String output;
            output = "Die beiden Personen können nicht heiraten!\n";
            return output;
        }
    }
    public String divored (Person p) {
        if (this.partner != null && p.partner != null &&
                this.partner.equals(p) && p.partner.equals(this)) {
            this.partner = null;
            p.partner = null;
            p.maritalStatus = "divorced";
            this.maritalStatus = "divorced";
            if (this.maidenName != null) {
                this.lastName = this.maidenName;
                this.maidenName = null;
            } else if (p.maidenName != null) {
                p.lastName = p.maidenName;
                p.maidenName = null;
            }
            String output = "Besser alleine, wie zu zweit sehr alleine!\n";
            return  output;
        }
        else {
            String output = "Die beiden Personen sind gar nicht miteinander verheiratet!\n";
            return output;
        }
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
