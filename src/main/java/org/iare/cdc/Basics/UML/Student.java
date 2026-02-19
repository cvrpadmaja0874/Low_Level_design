package org.iare.cdc.Basics.UML;

public class Student {
    private String studNo;
    private String studName;

    public Student(String sid, String sname){
        this.studNo = sid;
        this.studName = sname;
    }

    public String getStudNo(){
        return studNo;
    }

    public String getStudName(){
        return studName;
    }
}
