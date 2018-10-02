package one;

public class Director extends Employee {
    private int bonus;

    public Director(String firstName, String lastName, int salary, int bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(bonus);
    }

    @Override
    double totalSalary() {
        return getSalary() + bonus;
    }

    //    @Override
//    public void totalSalary() {
//        System.out.println(super.totalSalary() + Director(getBonus());
//    }
}
