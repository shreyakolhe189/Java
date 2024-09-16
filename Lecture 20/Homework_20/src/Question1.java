import java.util.*;
public class Question1 {
    //Count how many times lowercase vowels occurred in a String entered by the user
    public static int lowerCaseVowelsCount(String str){
        Integer count = 0;
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : "); //input string
        String str = sc.nextLine();

        System.out.println(lowerCaseVowelsCount(str));

    }
}
