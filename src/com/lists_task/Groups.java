package com.lists_task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Groups {
    private List<StudentGroup> groups;

    Groups(int count){
        groups = new ArrayList<>(count);
    }
    Groups(int count, ArrayList<Student> students ) {
        if(count > 0)
            groups = new ArrayList<>(count);
        else {
            System.err.println("count must be greater then 0");
        }

        for(int i = 0; i < count ; ++i) {
            groups.add(new StudentGroup(Integer.toString(i)));
        }
        if(!students.isEmpty() ) {
            setGroups(students);
            print();
        } else
            System.err.println("empty array");
    }

    public void setGroups(ArrayList<Student> students) {
        int size = groups.size();


        for (Student student : students) {
            ForeignLanguage lang = student.getLang();

            Optional<StudentGroup> minGroup = groups.stream().min(
                    Comparator.comparing(StudentGroup::getGroupSize)
                            .thenComparing(o -> o.getLangCount(lang))
            );
            if(minGroup.isPresent())
                minGroup.get().addStudent(student);
            else
            {
                System.err.println("min group  isnt present");
            }

           // groups.stream().min(Comparator.comparing(o -> ((Integer) o.getLangCount(lang)))).get().addStudent(student);
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