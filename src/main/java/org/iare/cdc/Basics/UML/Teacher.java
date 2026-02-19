package org.iare.cdc.Basics.UML;

public class Teacher {
    private String teacherId;
    private String teacherName;

    public Teacher(String id, String name){
        this.teacherId = id;
        this.teacherName = name;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public String getTeacherId(){
        return teacherId;
    }

    public void teaches(Student st){

        System.out.println(teacherName + " teaches " + st.getStudName());
    }
}
