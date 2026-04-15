import java.util.Scanner;

public class Assignment14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        int px = sc.nextInt();
        int py = sc.nextInt();
        double dis = Math.sqrt(px* px + py* py);
        System.out.println(dis);
    }
}
