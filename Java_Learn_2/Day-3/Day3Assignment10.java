import java.util.*;
public class Day3Assignment10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                second = largest;
                largest = num;
            }
            if(num > second && num != largest){
                second = num;            }
        }
        System.out.println(second);
    }
}
