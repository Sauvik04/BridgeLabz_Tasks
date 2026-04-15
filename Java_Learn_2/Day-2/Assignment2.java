import java.util.*;
public class Assignment2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (1,10,100,1000): ");
        int n = sc.nextInt();

        if (n == 1) System.out.println("Unit");
        else if (n == 10) System.out.println("Ten");
        else if (n == 100) System.out.println("Hundred");
        else if (n == 1000) System.out.println("Thousand");
        else System.out.println("Invalid");
    }
}
