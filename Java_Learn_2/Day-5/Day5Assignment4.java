import java.util.*;
public class Day5Assignment4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Enter a value greater than 0");
            return;
        }
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Harmonic Value = " + sum);
    }
}
