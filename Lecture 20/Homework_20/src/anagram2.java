import java.util.*;
public class anagram2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length()){
            //char
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            //sort
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            //
            boolean result = Arrays.equals(arr1,arr2);

            if(result){
                System.out.println("Anagrams");
            }else{
                System.out.println("Not anagrams");
            }
        }else{
            System.out.println("Not anagrams");
        }
    }
}
