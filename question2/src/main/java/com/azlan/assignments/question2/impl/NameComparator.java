package com.azlan.assignments.question2.impl;

import com.azlan.assignments.question2.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    private static final Logger logger = LoggerFactory.getLogger(NameComparator.class);

    public int compare(Student s1, Student s2) {
        String name1 = s1.getFirstName();
        String name2 = s2.getFirstName();

        // ascending order (descending order would be: name2.compareTo(name1))
        return name1.compareTo(name2);
    }
}
