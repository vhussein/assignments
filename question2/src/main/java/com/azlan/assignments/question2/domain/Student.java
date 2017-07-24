package com.azlan.assignments.question2.domain;

import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;

@Data
@AllArgsConstructor
public class Student implements Comparator<Student> {

    private static final Logger logger = LoggerFactory.getLogger(Student.class);

    private Integer id;
    private String firstName;
    private double gpa;

    public int compare(Student o1, Student o2) {

        logger.debug("Comparing o1 & o2");
        return 0;
    }

    public int compareTo(Student o2) {
        logger.debug("Comparing " + this.getFirstName() + " with " + o2.getFirstName());
        logger.debug("This gpa ==> " + this.gpa);
        logger.debug("o2 gpa ==> " + o2.getGpa());

//        ascending gpa
//        double delta = this.gpa - o2.getGpa();

//        descending gpa
        double delta = o2.getGpa() - this.gpa;
        logger.debug("Delta value is ==> " + delta);
        if(delta > 0)
        {
            logger.debug("Returning 1 for student " + o2.getFirstName());
            return  1;
        }
        else if (delta < 0)
        {
            logger.debug("Returning -1 for student " + o2.getFirstName());
            return  -1;
        }
        else
        {
            logger.debug("Returning 0 for student " + o2.getFirstName());
            return 0;
        }
    }
}
