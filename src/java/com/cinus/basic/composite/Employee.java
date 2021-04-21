package com.cinus.basic.composite;

public class Employee extends CompanyComposite {
    @Override
    protected void duty() {
        System.out.println("Employee : transaction service.");
    }
}
