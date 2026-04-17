import java.util.*;
public class Day5Assignment9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                System.out.println("Is a vowel");
            }else{
                System.out.println("Consonant");
            }
        }else{
            System.out.println("Not an Alphabet");
        }
    }
}
