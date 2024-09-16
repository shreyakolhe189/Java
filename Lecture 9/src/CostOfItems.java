import java.util.*;
public class CostOfItems {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float cost1 = sc.nextFloat();
        float cost2 = sc.nextFloat();
        float cost3 = sc.nextFloat();

        float total_cost = (cost1 + cost2 + cost3)/3;
        float total_cost_gst = total_cost + (total_cost * 0.18f);

        System.out.println("Bill is : " + total_cost);
        System.out.println("Bill with gst is : " + total_cost_gst);
    }
}
