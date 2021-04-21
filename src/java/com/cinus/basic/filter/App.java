package com.cinus.basic.filter;

import com.cinus.basic.filter.criteria.*;

import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Person> persons = new LinkedList<>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        System.out.println(male.meetCriteria(persons));

        System.out.println("Females: ");
        System.out.println(female.meetCriteria(persons));

        System.out.println("Single Males: ");
        System.out.println(singleMale.meetCriteria(persons));

        System.out.println("Single Or Females: ");
        System.out.println(singleOrFemale.meetCriteria(persons));
    }
}
