package org.iare.cdc.Basics.UML;

import java.util.List;
import java.util.Arrays;

class Professor{

    private String profName;

    public Professor(String name){

        this.profName = name;
    }

    public String getProfName(){

        return profName;
    }
}

class Department{

    private String deptId;
    private String deptName;
    private List<Professor> professors;


    public Department(String did, String dname, List<Professor> professors){
        this.deptId = did;
        this.deptName = dname;
        this.professors = professors;
    }

    public String getDeptNo(){
        return deptId;
    }
    public String getDeptName(){
        return deptName;
    }

    public void showProfessors() {
        System.out.println("List of Professors in " + deptName + " Department: ");
        for (Professor prof : professors) {
            System.out.println(prof.getProfName());
        }
    }
}
public class AggregationExample {

    public static void main(String args[]){
        Professor p1 = new Professor("Dr.C V R Padmaja");
        Professor p2 = new Professor("Dr.B Padmaja");
        Professor p3 = new Professor("Mr.Patro");

        List<Professor> professors = Arrays.asList(p2,p1,p3);
        Department dept = new Department("1050","CDC", professors);

        dept.showProfessors();
    }
}

