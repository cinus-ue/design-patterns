package com.cinus.basic.composite;

public class App {
    public static void main(String[] args) {
        Company company = new Company();
        company.add(new HRDepartment());
        FinanceDepartment financeDepartment = new FinanceDepartment();
        financeDepartment.add(new Employee());
        company.add(financeDepartment);
        System.out.println(company.count());
        company.print();
        System.out.println("opening a new branch office");
        company.add(new BranchOffice());
        System.out.println(company.count());
        company.print();
    }
}
