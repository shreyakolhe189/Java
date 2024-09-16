import java.util.*;
public class BinToDEc{
    public static int binaryToDecimal(int binary){
        int power = 0;
        int decimal = 0;
        while(binary > 0){
            int lastDigit = binary % 10;
            decimal = decimal + (lastDigit * (int)Math.pow(2,power));
            power++;
            binary = binary / 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary no. : ");
        int binary = sc.nextInt();

        System.out.println(binaryToDecimal(binary));

    }
}