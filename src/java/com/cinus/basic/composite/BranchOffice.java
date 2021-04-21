package com.cinus.basic.composite;

public class BranchOffice extends CompanyComposite {
    @Override
    protected void duty() {
        System.out.println("Branch Office : expand overseas business.");
    }
}
