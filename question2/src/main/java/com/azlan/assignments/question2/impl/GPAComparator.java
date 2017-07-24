package com.azlan.assignments.question2.impl;

import com.azlan.assignments.question2.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;

public class GPAComparator implements Comparator<Student> {

    private static final Logger logger = LoggerFactory.getLogger(Student.class);

    public int compare(Student o1, Student o2) {

//        ascending order
//        double delta = o1.getGpa() - o2.getGpa();

//        descending order
        double delta = o2.getGpa() - o1.getGpa();
        if(delta > 0)
            return  1;

        if (delta < 0)
            return  -1;

        return 0;
    }


}
