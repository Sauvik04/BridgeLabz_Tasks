import java.util.Scanner;

public class Assignment12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter day: ");
        int d = sc.nextInt();

        boolean isSpring =
                (m == 3 && d >= 20) ||
                        (m > 3 && m < 6) ||
                        (m == 6 && d <= 20);

        System.out.println("Is Spring Season: " + isSpring);
    }
}
