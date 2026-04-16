import java.util.*;
public class Day1Assignment7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Year must be >= 1582");
            return;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
