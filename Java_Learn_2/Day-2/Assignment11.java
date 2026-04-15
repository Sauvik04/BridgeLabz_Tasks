import java.util.Scanner;

public class Assignment11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
