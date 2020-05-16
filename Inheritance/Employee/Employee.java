public class Employee extends Person {
    private int start;
    private double salary;
    private String num;

    public Employee(String name, double salary, int start, String num) {
        super(name);
        this.salary = salary;
        this.start = start;
        this.num = num;
    }

    public int getStart() {
        return this.start;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getNum() {
        return this.num;
    }

    public void payRise(int newSalary) {
        if (newSalary > 0)
            this.salary += newSalary;
        else
            System.out.println("The new salary couldn't less than 0");
    }
}