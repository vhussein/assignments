package com.azlan.assignments.question2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class StudentComparisonClass {

    private static final Logger logger = LoggerFactory.getLogger(StudentComparisonClass.class);

    public static void main(String[] args)
    {

        Student[] students = new Student[5];

        students[0] = new Student(33, "Tina", 3.68);
        students[1] = new Student(85, "Louis", 3.85);
        students[2] = new Student(56, "Samil", 3.75);
        students[3] = new Student(19, "Samar", 3.75);
        students[4] = new Student(22, "Lorry", 3.76);

        logger.info("Before sort: ");
        for(Student s: students){
            logger.info(s.toString());
        }

        Arrays.sort(students, new StudentComparator());
        logger.info("Order of students after sorting by student name is");
        for (int i = 0; i < students.length; i++) {
            logger.info(students[i].getId() + "\t" + students[i].getFirstName() + "\t"
                    + students[i].getGpa());
        }

//        // 1 - sort the gpa
//        Arrays.sort(students, new GPAComparator());
//        logger.info("Order of students after sorting by student name is");
//        for (int i = 0; i < students.length; i++) {
//            logger.info(students[i].getId() + "\t" + students[i].getFirstName() + "\t"
//                    + students[i].getGpa());
//        }
//
//        // 2 - sort the name
//        Arrays.sort(students, new NameComparator());
//        logger.info("Order of students after sorting by student name is");
//
//        for (int i = 0; i < students.length; i++) {
//            logger.info(students[i].getId() + "\t" + students[i].getFirstName() + "\t"
//                    + students[i].getGpa());
//        }
//
//        //3 - sort the id
//        Arrays.sort(students, new IDComparator());
//        logger.info("Order of students after sorting by student ID is");
//
//        for (int i = 0; i < students.length; i++) {
//            logger.info(students[i].getId() + "\t" + students[i].getFirstName() + "\t"
//                    + students[i].getGpa());
//        }

//        System.out.println("After sort: ");
//        for(Student s: students){
//            System.out.println(s);
//        }



    }
}
