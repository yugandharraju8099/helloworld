package com.cg.student;

public class StudentReport {
    public static void main(String[] args){
        Student stObj = null;
        stObj = new Student();
        stObj.setStudentData();
        stObj.calTotal();
        stObj.printReport();
    }
}
