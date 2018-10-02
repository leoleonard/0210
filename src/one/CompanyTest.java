package one;

public class CompanyTest {
    public static void main(String[] args) {
//        Employee employee1 = new Employee("Jan", "Kowalski", 2300);
//        employee1.setSalary(3000);
//
//        Director director1 = new Director(500);
//        director1.setBonus(2000);

        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Anna", "Nowak", 2300);
        employees[1] = new Director("Jan", "Kowalski", 3500, 2000);

//        if (employees[1] instanceof Employee) {
//            (Employee(employees[1].showInfo()))
//        } else {
//            (Director(employees[2].showInfo()))
//        }
//        employees[1].showInfo();
//        employees[0].showInfo();

        employees[1].totalSalary();
        employees[0].totalSalary();


        //System.out.println(employees[0].getSalary());

        if (employees[0].getSalary() > 2000) {
            System.out.println(employees.length);
        } else {
            System.out.println("warunek nie został spełniony");
        }

    }


}
