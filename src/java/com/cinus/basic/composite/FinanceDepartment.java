package com.cinus.basic.composite;

public class FinanceDepartment extends CompanyComposite {

    @Override
    protected void duty() {
        System.out.println("Finance Department : financial planning and strategy.");
    }
}
