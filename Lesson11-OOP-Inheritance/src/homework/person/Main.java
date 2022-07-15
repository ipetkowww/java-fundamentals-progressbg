package homework.person;

public class Main {

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Female Person", 33, false),
                new Person("Male Person", 33, true),
                new Student("Ivan", 22, true, 4.50),
                new Student("Dani", 24, false, 5.90),
                new Employee("Gosho", 33, true, 80),
                new Employee("Petranka", 30, false, 120)
        };

        for (Person person : persons) {
            if (person instanceof Student) {
                System.out.println(((Student) person).showStudentInfo());
            } else if (person instanceof Employee) {
                System.out.println(((Employee) person).showEmployeeInfo());
            } else {
                System.out.println(person.showPersonInfo());
            }
        }

        int overTimeHours = 2;
        for (Person person : persons) {
            if (person instanceof Employee) {
                System.out.println("Money after overtime: " + ((Employee)person).calculateOvertime(overTimeHours));
            }
        }
    }
}
