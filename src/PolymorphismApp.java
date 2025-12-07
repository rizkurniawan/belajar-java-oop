public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Rizky");
        employee.sayHello("EKo");

        employee = new Manager("Rizky");
        employee.sayHello("Eko");

        employee = new VicePresident("Rizky");
        employee.sayHello("Eko");

        sayHello(new Employee("Joko"));
        sayHello(new Manager("Edo"));
        sayHello(new VicePresident("Teddy"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }

    }
}
