package com.azlan.assignments.question2;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class StudentComparatorTest {
    
    private StudentComparator studentComparator;

    private Student[] students = new Student[7];

    
    
    @Before
    public void init()
    {
        studentComparator = new StudentComparator();

        students[0] = new Student(33, "Tina", 3.68);
        students[1] = new Student(85, "Louis", 3.85);
        students[2] = new Student(56, "Samil", 3.75);
        students[3] = new Student(19, "Samar", 3.75);
        students[4] = new Student(22, "Lorry", 3.76);
        students[5] = new Student(50, "Samil", 3.75);
        students[6] = new Student(20, "Samar", 3.75);

        System.out.println("Initial input is : ");
        for (Student s: students
             ) {

            System.out.println(s);
        }
    }
    
    @Test
    public void studentCompareTest()
    {
        Arrays.sort(students, new StudentComparator());
        System.out.println("Order of students after sorting by student name is");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getId() + "\t" + students[i].getFirstName() + "\t"
                    + students[i].getGpa());
        } 
    }
}
