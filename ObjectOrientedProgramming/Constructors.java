package ObjectOrientedProgramming;

public class Constructors {

    public static class StudentData{
        String name;
        int rno;
        int [] marks;
        StudentData(int [] s){
            marks = s;
        }    }

    public static class Car{
        int seats;
        String name;
        double length;

        Car(){ // default constructor

        }
        Car(int seats, String name, double length){
            this.seats = seats; // this always used to indicate the variable specially present in the class.
            this.name =name;
            this.length = length;
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(5, "Kia Sonet", 3.99);
        System.out.println(c1);
    
        int [] arr = {4,7,1,4,8};
        StudentData s1 = new StudentData(arr);
        s1.marks[0] = 40;
        System.out.println(arr[0]); // Shallow Copy.

    
    
    }
}
