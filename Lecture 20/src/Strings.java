import java.util.*;
public class Strings {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args){
        //strings are immutable

        //string declaration
        String str = "abcd";
        String str2 = new String("Abcd");

        System.out.println(str);
        System.out.println(str2);

        //input output
        Scanner sc = new Scanner(System.in);
        //String name = sc.next(); //takes only 1st name
        //System.out.println(name);
        String name;
        name = sc.nextLine(); //takes all inputed string
        System.out.println(name);

        //length
        System.out.println(name.length());

        //concatenate string
        String firstName = "Shreya";
        String lastName = "Kolhe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //charat
        System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }
}
