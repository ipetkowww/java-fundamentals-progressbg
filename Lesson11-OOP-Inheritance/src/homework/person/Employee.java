package homework.person;

public class Employee extends Person {

    private double daySalary;
    private boolean isWorkOvertime;

    public Employee(String name, int age, boolean isMale, double daySalary) {
        super(name, age, isMale);
        this.daySalary = daySalary;
        this.isWorkOvertime = false;
    }

    public double calculateOvertime(double hours) {
        if (getAge() < 18) {
            return 0;
        }
        return daySalary * hours * 1.5;
    }

    public String showEmployeeInfo() {
        return super.showPersonInfo() + "Day salary " + daySalary;
    }
}
