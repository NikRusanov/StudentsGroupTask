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
        new Groups(5,students);
    }


}

