package org.iare.cdc.Basics.UML;

public class AssociationExample {
    public static void main(String args[]){
        Student s1 = new Student("501", "Rama");
        Teacher t1 = new Teacher ("T01", "Krishna");

        t1.teaches(s1);
    }
}
