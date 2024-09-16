import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings : ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2. length()){
            //to char array
            char array1[] = str1.toCharArray();
            char array2[] = str2.toCharArray();

            //sort
            Arrays.sort(array1);
            Arrays.sort(array2);

            boolean result = Arrays.equals(array1, array2);

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
