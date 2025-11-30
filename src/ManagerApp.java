public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Rizky";
        manager.sayHello("Eko");

        VicePresident vp = new VicePresident();
        vp.name = "Kiki";
        vp.sayHello("Tony");
    }
}
