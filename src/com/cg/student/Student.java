package com.cg.student;

public class Student {
    private int rollNumber;
    private String name;
    private float mark1,mark2,total;
    private boolean result;
    void setStudentData(){
        rollNumber =23456;
        name = "Raju";
        mark1 = 78.f;
        mark2 = 32.f;

    }
    void calTotal(){
        total = mark1+mark2;
    }
    boolean isPass(){
        if(total>=60)
            result = true;
        else{
            result = false;
        }
        return result;

    }
    void printReport()
    {
        System.out.println("rollno : " + rollNumber);
        System.out.println("Name : "+ name);
        if(isPass()) {
            System.out.println("result : pass");
        }
            else
            {
                System.out.println("result : fail");

            }
        }

}
