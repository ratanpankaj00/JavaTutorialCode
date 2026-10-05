public class PracticeSet8Q1 {
    public static class Employee {
        private int salary;
        private String name;

        public Employee() {
            salary = 0;
            name = "Your-Name-Here";
        }

        public void setName(String n) {
            this.name = n;
        }

        public void setSalary(int n) {
            this.salary = n;
        }

        public String getName() {
            return name + " -";
        }

        public int getsalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        Employee ramesh = new Employee();
        Employee smith = new Employee();
        ramesh.setName("Ramesh Mahto");
        ramesh.setSalary(10000);
        System.out.print(ramesh.getName());
        System.out.println(ramesh.getsalary());

        smith.setName("Aliter Smith");
        smith.setSalary(100000);
        System.out.print(smith.getName());
        System.out.println(smith.getsalary());
    }
}
