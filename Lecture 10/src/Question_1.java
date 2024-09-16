import java.util.*;
public class Question_1 {
    public static void main(String[] args) {
        //WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if(n<0){
            System.out.println("Negative");
        }else if(n>0){
            System.out.println("Positive");
        }else{
            System.out.println("Zero");
        }

    }
}
