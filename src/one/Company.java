package one;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Jan", "Kowalski", 2000);
        employees[1] = new Director("Karolina", "Dyrektor", 4000, 2300);

//        employees[0].showInfo();
//        employees[1].showInfo();

        //showInfo
        for (Person employee : employees) {
            employee.showInfo();
        }
        //laczna suma wyplat 1
        double total = 0;
        for (Employee employee : employees) {
            total += employee.totalSalary();
        }
        //laczna suma wyplat 2
        double total2 = employees[0].totalSalary() + employees[1].totalSalary();

        int empNumbABove300 = countEmployees(employees, 3000);
        System.out.println("powyżej 300pln zarabia " + empNumbABove300);
    }

    static int countEmployees(Employee[] employees, double limit) {
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].totalSalary() > limit)
                counter++;
        }
        return counter;
    }
}
