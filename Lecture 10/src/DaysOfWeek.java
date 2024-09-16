import java.util.*;
public class DaysOfWeek {
    public static void main(String[] args) {
        //WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number : ");
        int num = sc.nextInt();

        switch(num){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thurday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Enter number between 1 to 7.");

        }

    }
}
