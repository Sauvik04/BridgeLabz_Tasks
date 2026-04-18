import java.util.*;
public class Day6Assignment4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result =0;
        while(n > 0){
            int temp = n % 10;
            result = (result * 10) + temp;
            n = n /10;
        }
        System.out.println(result);
    }
}
