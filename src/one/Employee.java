package one;

public class Employee extends Person {
    private int salary;

    public Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(salary);
    }

//    public void totalSalary() {
//        System.out.println(getSalary());;
//    }

    double totalSalary() {
        return salary;
    }
}
