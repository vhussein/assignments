package com.azlan.assignments.question2.impl;

import com.azlan.assignments.question2.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    private static final Logger logger = LoggerFactory.getLogger(StudentComparator.class);

    public int compare(Student s1, Student s2) {
        //compare the gpa
        int comp = s1.compareTo(s2);
        if(comp!=0){
            return comp;
        }else{
            NameComparator nameCmp = new NameComparator();
            comp = nameCmp.compare(s1, s2);
            if(comp!=0){
                return comp;
            }else{
                IDComparator idCmp = new IDComparator();
                comp = idCmp.compare(s1, s2);
                return comp;
            }
        }
    }
}
