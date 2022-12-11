package com.pragra.Demo;

public class Employee  extends Person{
    private int employeeId;
    private String emailId;
    private String designation;




    public Employee(String lastName, String firstName, int age, int employeeId,String emailId, String designation){
        super(lastName,firstName, age);
        this.employeeId =  employeeId;
        this.emailId = emailId;
        this.designation =  designation;
    }

}
