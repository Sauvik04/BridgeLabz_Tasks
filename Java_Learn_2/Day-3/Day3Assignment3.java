import java.util.*;
public class Day3Assignment3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[]arr = new int[n];
        for(int i =0; i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        int largest =arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > arr[0]){
               largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
