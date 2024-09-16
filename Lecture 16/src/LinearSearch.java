import java.util.*;
public class LinearSearch {
    public static void elementIndex(int elements[], int key){
        for(int i=0; i<elements.length; i++){
            if(elements[i] == key){
                System.out.println(key + " is at index : " + i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key : ");
        int key = sc.nextInt();
        int elements[] = {2,4,6,8,14,16,10,12};
        elementIndex(elements, key);
    }
}

