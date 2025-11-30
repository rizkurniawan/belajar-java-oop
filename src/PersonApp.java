public class PersonApp {
    public static void main(String[] args) {
        // create object
        var person1 = new Person();
        person1.name = "Rizky";
        person1.address = "Jakarta";
        // person1.country = "Amerika"; // ERROR

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person();

    }
}
