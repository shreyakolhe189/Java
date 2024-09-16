import java.util.*;
public class Question4 {
    //Determine if 2 Strings are anagrams of each other.
    // What are anagrams?
    // If two strings contain the same characters but in a different order,they can be said to be anagrams.
    // Consider race and care.
    // In this case,race's characters can be formed into a study,or care's characters can be formed into race.
    // Below is a java program to check if two strings are anagrams or not

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String str1 = sc.nextLine(); // input
        System.out.println("Enter string 2 : ");
        String str2 = sc.nextLine();

        // lowercase all, sort, equals char array
        //lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //lengths same ?
        if(str1.length() == str2.length()){
            //convert string to char
            char str1charr[] = str1.toCharArray();
            char str2charr[] = str2.toCharArray();
            //sort
            Arrays.sort(str1charr);
            Arrays.sort(str2charr);

            boolean result = Arrays.equals(str1charr,str2charr);

            if(result){
                System.out.println("Anagrams");
            }else{
                System.out.println("Not anagrams");

            }
        }

    }
}
