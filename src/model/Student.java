package model;

public class Student{

    private String name;
    private int age;
    private double average;
    private String studentId;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getage() {
        return this.age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public double getaverage() {
        return this.average;
    }

    public void setaverage(double average) {
        this.average = average;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public Student(String name, int age, double average, String studentId) {
        this.name = name;
        this.age = age;
        this.average = average;
        this.studentId = studentId;
    }
    

}