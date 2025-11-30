public class PersonApp {
    public static void main(String[] args) {
        // create object
        Person person1 = new Person("Rizky", "Jakarta");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Eko");
    }
}
