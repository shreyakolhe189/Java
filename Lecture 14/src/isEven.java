import java.util.*;
public class isEven {
    public static void isEven(int n){
        if(n % 2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
    public static void main(String[] args) {
        //method named isEven that accepts an int argument
        //return true if the argument is even,or false otherwise
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if even(true) or odd(false) : ");
        int n = sc.nextInt();
        isEven(n);
    }
}
