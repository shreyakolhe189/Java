import java.util.*;
public class ArrayMarks{
    public static void arrayMarks(int n, int marks[]){
        //output marks
        for(int i=0; i<n; i++){
            //update
            marks[i] = marks[i] + 1;
            System.out.println("Subject " + (i+1) + " marks = " + marks[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input array size
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        //initialize array
        int marks[] = new int[n];

        //input array
        System.out.println("Enter marks for " + n + " subjects : ");
        for(int i=0; i<n; i++){
            marks[i] = sc.nextInt();
        }

        //call function
        arrayMarks(n, marks);
    }
}