import java.util.*;
public class Day5Assignment3 {
    public static void main(String[]args){
        if(args.length == 0){
            return;
        }
        int n = Integer.getInteger(args[0]);
        if(n < 0 || n >= 30){
            System.out.println("Enter a number betwn 0 and 30: ");
            return;
        }
        int power = 1;
        for(int i = 0;i < n;i++){
            power = power * 2;
            System.out.println(power);
        }
    }
}