import java.util.*;
import java.util.Random;
public class Day6Assignment5 {
    public static int getRandom(int n) {
        return (int)(Math.random() * n) + 1;
    }
    public static int collectCoupons(int n) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        while (set.size() < n) {
            int num = getRandom(n);
            count++;
            set.add(num);
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = collectCoupons(n);
        System.out.println("Total random numbers needed: " + total);

    }
}
