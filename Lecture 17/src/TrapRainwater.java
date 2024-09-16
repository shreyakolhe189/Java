import java.util.*;
public class TrapRainwater {
    public static int trapWater(int height[], int width){
        int n = height.length;
        //left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        //loop
        int trapwater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trapwater += (waterLevel - height[i]) * width;

        }
        return trapwater;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //size of array //no. of bars
        System.out.println("Enter no. of bars : ");
        int size = sc.nextInt();
        //array initialize
        int height[] = new int[size];
        //input width of bar
        System.out.println("Enter bar width : ");
        int width = sc.nextInt();
        //array input //input bar height
        System.out.println("Enter bar heights : ");
        for(int i=0; i<size; i++){
            height[i] = sc.nextInt();
        }

        System.out.println(trapWater(height,width));

    }
}
