import java.util.*;
public class Day1Assignment3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        System.out.println(isEqual(a,b));
    }
    static boolean isEqual(String a,String b){
        if(a.length() != b.length()){
            return false;
        }
        for(int i =0;i < a.length();i++){
            if(a.charAt(i) != b.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
