package com.azlan.assignments.question2.impl;

import com.azlan.assignments.question2.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;

public class IDComparator implements Comparator<Student> {

    private static final Logger logger = LoggerFactory.getLogger(IDComparator.class);

    public int compare(Student s1, Student s2){
        int s1Id = s1.getId();
        int s2Id = s2.getId();

        //ascending
        return s1Id - s2Id;
    }
}
