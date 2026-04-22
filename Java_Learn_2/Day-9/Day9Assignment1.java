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
    public static void editContact() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name to Edit: ");
        String name = sc.nextLine();

        for (Contact c : list) {
            if (c.firstName.equals(name)) {
                System.out.print("Enter New City: ");
                c.city = sc.nextLine();
                System.out.println("Contact updated!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }
    public static void main(String[] args) {
        addContact();
        editContact();
    }
}