package programmer.zaman.now.data;

public class EqualsApp {
    public static void main(String[] args) {
        String name = "Eko";
        name = name + " " + "Khannedy";

        System.out.println(name);

        String name2 = "Eko Khannedy";
        System.out.println(name2);

        System.out.println(name == name2);
        System.out.println(name.equals(name2));
    }
}
