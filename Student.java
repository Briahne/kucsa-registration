package com.kucsa.register.model;

public class Student {
    private String fullName;
    private String registrationNumber;
    private String email;
    private String course;
    private String academicYear;

    //Constructors
    public Student() {}

    public Student(String fullName, String registrationNumber, String email, String course, String academicYear) {
        this.fullName = fullName;
        this.registrationNumber = registrationNumber;
        this.email = email;
        this.course = course;
        this.academicYear = academicYear;
    }

    //Getters and Setters
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getAcademicYear() { return academicYear; }
    public void setAcademicYear(String academicYear) { this.academicYear = academicYear; }
}
