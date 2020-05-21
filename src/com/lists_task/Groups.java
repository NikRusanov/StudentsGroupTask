package com.lists_task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Groups {
    private List<StudentGroup> groups;

    Groups(int count){
        groups = new ArrayList<>(count);
    }
    Groups(int count, ArrayList<Student> students ) {
        groups = new ArrayList<>(count);
        for(int i = 0; i < count ; ++i) {
            groups.add(new StudentGroup(Integer.toString(i)));
        }
        setGroups(students);
        print();
    }

    public void setGroups(ArrayList<Student> students) {
        int size = groups.size();


        for (Student student : students) {
            ForeignLanguage lang = student.getLang();
            groups.stream().min(Comparator.comparing(o -> ((Integer) o.getLangCount(lang)))
                ).get().addStudent(student);
        }
    }

    public void print()
    {
        int i = 0 ;
        for(StudentGroup group : groups){
            System.out.println("group : "  + i);
            System.out.println(group.toString());
            ++i;
        }
    }
}