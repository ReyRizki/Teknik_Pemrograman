public class Driver {
    public static void main(String[] args) {
        Employee employee = new Employee("Laras", 5000, 1975, "191524016");

        employee.payRise(10000);

        System.out.println(employee.getSalary());
    }
}