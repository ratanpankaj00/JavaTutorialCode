class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    public int getSalary(){
        System.out.print("Salary: ");
        return salary;
    }
}
public class CustomClass {
    
    public static void main(String[] args) {
        System.out.println("This is Custom class Tutorial");
        
        Employee harry = new Employee();// Instantiating a new Employee Object.
        
        //SETTING ATTRIBUTES
        harry.id = 12;
        harry.name = "Harry";
        harry.salary = 38;
        // System.out.println(harry.id +" " + harry.name);
        harry.printDetails();
        System.out.println(harry.getSalary());


        //Instantiating a another new Employee object.
        Employee john = new Employee();
        john.id = 14;
        john.salary = 18;
        john.name = "John Khendelwal";
        john.printDetails();
        System.out.println(john.getSalary());
    }
}
