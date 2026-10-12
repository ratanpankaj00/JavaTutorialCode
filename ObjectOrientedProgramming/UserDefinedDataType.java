package ObjectOrientedProgramming;

public class UserDefinedDataType{

    public static class Student{ // Maine apna khud ka data type create kar liya hai.
        String name; // Attributes
        int rno;
        double cgpa;

    }
    public static void main(String[] args) {
        /* 
        Objects are real life entities.
        Class is a blue print.
        */
        
        Student s1 = new Student(); // Declaration of new object.
        s1.name = "Raghav";
        s1.rno = 23;
        s1.cgpa = 8.5;  

        Student s2 = new Student(); // Declaration of new object.
        s2.name = "Lavish";
        s2.rno = 33;
        s2.cgpa = 2.2;  

        Student s3 = new Student(); // Declaration of new object.
        s3.name = "Anaghab";
        s3.rno = 13;
        s3.cgpa = 9.37;        

        System.out.println(s1.cgpa); //We can print.

        s2.cgpa = 9.9; //We can update.


    }
}

