public class WaterTrap {
    public static void trapwater(int height[], int width){
        int trapwater = 0;
        int n = height.length;

        //leftmax
        int leftMax[] = new int[n];
        for(int i=1; i<n; i++){
            leftMax[0] = height[0];
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //rightmax
        int rightMax[] = new int[n];
        for(int i=n-2; i>=0; i--){
            rightMax[n-1] = height[n-1];
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop waterlevel trapwater
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            trapwater += (waterlevel - height[i]) * width;
        }
        System.out.println(trapwater);
    }

    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        int width = 1;
        trapwater(height,width);
    }
}
