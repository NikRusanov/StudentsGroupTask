package com.lists_task;

import java.util.TreeMap;
import java.util.TreeSet;

public class StudentGroup {
    private TreeSet<Student> students;
    private final TreeMap<ForeignLanguage,Integer> languages_count;
    private  String name;
    public StudentGroup(String name) {
        students = new TreeSet<>();
        languages_count = new TreeMap<>();
        this.name = name ;
    }

    public void addStudent(Student student) {
        students.add(student);
        if(languages_count.containsKey(student.getLang())) {
            incLangCount(student.getLang());
        } else {
            languages_count.put(student.getLang(), 1);
        }
    }

    public int getLangCount(ForeignLanguage fl) {
        return languages_count.getOrDefault(fl,0);
    }

    public void  removeStudentByFirstName(String name) {
      for(Student student : students) {
          if (student.getFirstName().equals(name)) {
            students.remove(student);
            decLangCount(student.getLang());
          }
      }
    }
    private void incLangCount(ForeignLanguage fl) {
        Integer v = languages_count.getOrDefault(fl,0) + 1 ;
        languages_count.replace(fl,v);
    }
    private void decLangCount(ForeignLanguage fl) {
        Integer v = languages_count.getOrDefault(fl,0);
        if(v > 0 ) {
            v--;
        }
        languages_count.replace(fl, v);
    }

    @Override
    public String toString() {
        String result = "";
        for(Student st : students) {
            result += st.toString() + "\n";
        }
        return result;
    }

    public String getName() {
        return name;
    }
    public int getSize() {
        return  students.size();
    }
}

