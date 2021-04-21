package com.cinus.basic.filter.criteria;

import com.cinus.basic.filter.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
