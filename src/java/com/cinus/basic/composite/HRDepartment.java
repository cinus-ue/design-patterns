package com.cinus.basic.composite;

public class HRDepartment extends CompanyComposite {
    @Override
    protected void duty() {
        System.out.println("HR Department : human resource planning and strategy.");
    }
}
