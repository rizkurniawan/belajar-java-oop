public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Rizky");
        manager.sayHello("Eko");

        VicePresident vp = new VicePresident("Joko");
        vp.sayHello("Tony");
    }
}
