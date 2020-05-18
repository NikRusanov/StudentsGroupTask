package com.lists_task;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Phoebe",
                "Lydia",
                "Bruce",
                "Moscow",
                ForeignLanguage.EN));
        students.add(new Student("Hannah",
                "Hannah",
                "Hamza",
                "Moscow",
                ForeignLanguage.EN));
        students.add(new Student("Florence",
                "Verity",
                "Stella",
                "Moscow",
                ForeignLanguage.CN));
        students.add(new Student("Martha",
                "Faith",
                "Brian",
                "Moscow",
                ForeignLanguage.EN));
        students.add(new Student("Mia",
                "Anya",
                "Archie",
                "Moscow",
                ForeignLanguage.FR));

        students.add(new Student("Elizabeth",
                "Margie",
                "Jimmy",
                "Moscow",
                ForeignLanguage.FR));
             students.add(new Student("Ellie",
                "Maria",
                "Jac",
                "Moscow",
                ForeignLanguage.FR));
             students.add(new Student("Jessica",
                "Fatimah",
                "Gary",
                "Moscow",
                ForeignLanguage.CN));
             students.add(new Student("Isabelle",
                "Aliyah",
                "Kristian",
                "Moscow",
                ForeignLanguage.CN));
        students.add(new Student("Nicole",
                "Alfie",
                "Denise",
                "Moscow",
                ForeignLanguage.CN));
        StudentProcessor processor = new StudentProcessor();
        processor.sortInGroup(students);
        System.out.println(processor.toString());

/*        for (var student : students) {

            if(group1.size() >= 10 && group2.size() >= 10)
                return;
            if(group1.size() >= 10) {
                group2.add(student);
            }
            if (group2.size() >= 10) {
                group1.add(student);
            }

            ForeignLanguage fl = student.getLang();
            long count1 = getCount(fl, group1);
            long count2 = getCount(fl, group2);
            if(count1 <= count2) {
                group1.add(student);
            } else {
                group2.add(student);
            }
        }


        System.out.println("group1: ");
        printArray(group1);
        System.out.println("\n\n group2: ");
        printArray(group2);
     */

    }
   /* private  static  long getCount(ForeignLanguage fl, Set<Student> students) {
        return students.stream().filter((s) -> {
            return s.getLang() == fl;
        }).count();
    }
    private  static  void printArray(Set<Student> arr) {
        for(var e : arr) {
            System.out.println(e.toString());
        }
    } */

}

