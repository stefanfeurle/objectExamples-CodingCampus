package com.company;

public class Main {

    public static void main(String[] args) {
        Person boss = new Person("Alfred", "Boss","m");
        Person mustermann = new Person("Max", "Mustermann", "m");
        Person musterfrau = new Person("Angela","Musterfrau", "w");
        Person muste = new Person("Alfons", "Muste", "m");
        Person kufmann = new Person("Alois","Kufmann","m");
        Person gunz = new Person("Herlinde", "Gunz","w");
        Person friedrich = new Person("Hermann","Friedrich", "m");
        Person peter = new Person("Hannelore","Peter", "w");
        Person but = new Person("Moritz", "But","m");
        Person oberhuber = new Person("Marc","Oberhuber", "m");
        Person kurz = new Person("Sebastian","Kurz","m");

        Department board = new Department("Vorstand",1,boss);
        Department sales = new Department("Vertrieb", 2, mustermann);
        Department salesPrivatCustomers = new Department("Vertrieb Privatkunden",3, musterfrau);
        Department salesCorporateCustomers = new Department("Vertrieb Firmenkunden",3, muste);
        Department purchasing = new Department("Einkauf",2, kufmann);
        Department purchasingMechanics = new Department("Einkauf Mechanik",3, gunz);
        Department purchasingSmallParts = new Department("Einkauf Kleinteile", 4,friedrich);
        Department purchasingLargeParts = new Department("Einkauf Großteile",4,peter);
        Department purchasingEurope = new Department("Einkauf Europa",5, but);
        Department purchasingOverseas = new Department("Einkauf Übersee",5, oberhuber);




        board.addSubDepartment(sales);
        sales.addSubDepartment(salesPrivatCustomers);
        sales.addSubDepartment(salesCorporateCustomers);
        board.addSubDepartment(purchasing);
        purchasing.addSubDepartment(purchasingMechanics);
        purchasingMechanics.addSubDepartment(purchasingSmallParts);
        purchasingMechanics.addSubDepartment(purchasingLargeParts);
        purchasingLargeParts.addSubDepartment(purchasingEurope);
        purchasingLargeParts.addSubDepartment(purchasingOverseas);

        System.out.println();
        board.getOrganizationChart();

        board.changeChief(kurz);

        System.out.println("\n" + board.chief.firstName + " " + board.chief.lastName + " ist der neue Vorstand!\n");
        purchasingOverseas.changeChief(boss);
        board.getOrganizationChart();

        Person mallmann = new Person("Veridana","Mallmann", "w");
        Person biedermann = new Person("Petra", "Biedermann", "w");
        Person welte = new Person("Christine", "Welte", "w");

        board.setDepartmentForNewEmployee(mallmann);
        board.setDepartmentForNewEmployee(biedermann);
        board.setDepartmentForNewEmployee(welte);
        purchasing.setDepartmentForNewEmployee(oberhuber);

        board.switchDepartmentForEmployee(biedermann,purchasingOverseas);

        System.out.println();
        System.out.println();
        //purchasing.getOrganizationChart();
        System.out.println();
        System.out.println();
        board.printEmployedInDepartment();
        purchasing.printEmployedInDepartment();

        Person mayerL = new Person("Lukas", "Mayer", "m");
        sales.setDepartmentForNewEmployee(mayerL);
        Person mayerS = new Person("Stephanie", "Mayer","w");
        salesCorporateCustomers.setDepartmentForNewEmployee(mayerS);
        Person mayerW = new Person("Wolfgang","Mayer", "m");
        salesPrivatCustomers.setDepartmentForNewEmployee(mayerW);
        Person wielath = new Person("David", "Wielath", "m");
        purchasingEurope.setDepartmentForNewEmployee(wielath);
        Person burkhard = new Person("Magdalena", "Burkhard", "w");
        purchasingLargeParts.setDepartmentForNewEmployee(burkhard);
        Person halbritter = new Person("Tanja", "Halbritter", "w");
        purchasingMechanics.setDepartmentForNewEmployee(halbritter);
        Person palm = new Person("Lina", "Palm", "w");
        purchasingSmallParts.setDepartmentForNewEmployee(palm);
        Person schwendinger = new Person("Evelyn","Schwendinger", "w");
        salesCorporateCustomers.setDepartmentForNewEmployee(schwendinger);
        Person tuertscher = new Person("Nadine", "Türtscher", "w");
        salesPrivatCustomers.setDepartmentForNewEmployee(tuertscher);
        Person scheier = new Person("Sarah", "Scheier", "w");
        purchasingSmallParts.setDepartmentForNewEmployee(scheier);
        Person stoss = new Person("Simon", "Stoß", "m");
        purchasingLargeParts.setDepartmentForNewEmployee(stoss);
        Person benda = new Person("Fabio", "Benda", "m");
        purchasingMechanics.setDepartmentForNewEmployee(benda);
        Person fitz = new Person("Dominik", "Fitz", "m");
        purchasingEurope.setDepartmentForNewEmployee(fitz);
        Person borg = new Person("Andreas", "Borg", "m");
        purchasingOverseas.setDepartmentForNewEmployee(borg);
        Person ylmaz = new Person("Eyup", "Ylmaz", "m");
        purchasingOverseas.setDepartmentForNewEmployee(ylmaz);
        Person tries = new Person("Louis", "Tries", "m");
        sales.setDepartmentForNewEmployee(tries);
        Person schwaerzler = new Person("Manfred", "Schwärzler", "m");
        salesCorporateCustomers.setDepartmentForNewEmployee(schwaerzler);
        Person matt = new Person("Gerold","Matt", "m");
        salesPrivatCustomers.setDepartmentForNewEmployee(matt);
        Person welteS = new Person("Stefan", "Welte", "m");
        salesPrivatCustomers.setDepartmentForNewEmployee(welteS);
        Person welteF = new Person("Franz", "Welte", "m");
        salesPrivatCustomers.setDepartmentForNewEmployee(welteF);
        Person welteJ = new Person("Johannes", "Welte", "m");
        purchasingEurope.setDepartmentForNewEmployee(welteJ);
        Person bodemann = new Person("David", "Bodemann", "m");
        purchasingOverseas.setDepartmentForNewEmployee(bodemann);
        Person mayerR = new Person("Rene", "Mayer", "m");
        purchasingOverseas.setDepartmentForNewEmployee(mayerR);

        System.out.println();
        salesPrivatCustomers.switchDepartmentForEmployee(welteF,purchasing);

        board.getOrganizationChartWithEmployee();
        System.out.println();
        //purchasing.getOrganizationChartWithEmployee();
        System.out.println();
        //sales.getOrganizationChartWithEmployee();
        System.out.println();


        boolean topLevelPrinted = false;
        board.getOrganizationChartWithEmployee(board, topLevelPrinted);
        System.out.println();
        //purchasing.getOrganizationChartWithEmployee(null);
        System.out.println();
        //sales.getOrganizationChartWithEmployee(null);
        System.out.println();
        //purchasingOverseas.getOrganizationChartWithEmployee(null);

    }
}
