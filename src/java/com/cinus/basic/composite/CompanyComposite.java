package com.cinus.basic.composite;

import java.util.LinkedList;
import java.util.List;

public abstract class CompanyComposite {

    private List<CompanyComposite> children = new LinkedList<>();

    public void add(CompanyComposite companyComposite) {
        children.add(companyComposite);
    }

    public int count() {
        return children.size();
    }

    protected void duty() {
    }

    public void print() {
        duty();
        for (CompanyComposite composite : children) {
            composite.print();
        }
    }


}
