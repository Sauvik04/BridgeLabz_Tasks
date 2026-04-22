import java.util.*;

class Contact {
    String firstName, lastName, address, city, state;
    int zip;
    String phone, email;
}

public class Day9Assignment1 {
    static ArrayList<Contact> list = new ArrayList<>();
    public static void addContact() {
        Scanner sc = new Scanner(System.in);

        Contact c = new Contact();

        System.out.print("First Name: ");
        c.firstName = sc.nextLine();

        System.out.print("Last Name: ");
        c.lastName = sc.nextLine();

        System.out.print("City: ");
        c.city = sc.nextLine();

        list.add(c);

        System.out.println("Contact added!");
    }
    public static void main(String[] args) {
        addContact();
    }
}