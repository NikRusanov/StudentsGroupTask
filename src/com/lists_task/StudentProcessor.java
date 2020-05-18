package com.lists_task;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class StudentProcessor {
   private Set<Student> group1;
   private Set<Student> group2;
   private int size1 = 0 ;
   private int size2 = 0 ;

   StudentProcessor() {
       group1 = new TreeSet<>();
       group2 = new TreeSet<>();
   }
    public  void sortInGroup (List<Student> students) {

        for (var student : students) {

            if(size1 >= 10 && size2 >= 10) {
                System.err.println("Full groups");
                return;
            }
            if(size1 >= 10) {
                group2.add(student);
                ++size2;
            }
            if (size2 >= 10) {
                ++size1;
                group1.add(student);
            }

            ForeignLanguage fl = student.getLang();
            long count1 = getCount(fl, group1);
            long count2 = getCount(fl, group2);
            if(count1 <= count2) {
                group1.add(student);
                ++size1;
            } else {
                ++size2;
                group2.add(student);
            }
        }
    }

    private  long getCount(ForeignLanguage fl, @NotNull Set<Student> students) {
        return students.stream().filter((s) -> {
            return s.getLang() == fl;
        }).count();
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("group 1 : \n");
        for(var student : group1) {
            builder.append(student.toString());
            builder.append("\n");
        }
        builder.append("group 2 : \n");
        for(var student : group2) {
            builder.append(student.toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}

