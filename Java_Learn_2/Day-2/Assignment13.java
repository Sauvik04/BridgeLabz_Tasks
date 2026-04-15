import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter coefficients a, b, c: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        double delta = y * y - 4 * x * z;

        if (delta > 0) {
            double root1 = (-y + Math.sqrt(delta)) / (2 * x);
            double root2 = (-y - Math.sqrt(delta)) / (2 * x);

            System.out.println("Two real roots: " + root1 + ", " + root2);
        } else if (delta == 0) {
            double root = (-y) / (2 * x);
            System.out.println("One real root: " + root);
        } else {
            System.out.println("No real roots");
        }
    }
}
