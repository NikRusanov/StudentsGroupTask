package com.lists_task;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private ForeignLanguage lang;

    public Student(String firstName, String lastName, String patronymic, String address, ForeignLanguage lang) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.lang = lang;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ForeignLanguage getLang() {
        return lang;
    }

    public void setLang(ForeignLanguage lang) {
        this.lang = lang;
    }

    @Override
    public int compareTo(Student o) {
        int res = this.lastName.compareTo(o.lastName);
        if(res == 0 ) {
            res = this.firstName.compareTo(o.firstName);
        }
        return res;
    }

    @Override
    public String toString() {
        return
                firstName + ' ' +
                lastName + ' ' +
                patronymic + ' ' +
                "lang=" + lang ;
    }
}
