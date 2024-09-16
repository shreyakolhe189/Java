public class Question4 {
    //Given n non-negative integers representing an elevation map
    // where the width of each bar is 1,
    // compute how much water it can trap after raining

    //Input:height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1]  Output:   6
    public static int trappedWater(int height[],int width){
        int trapWater = 0;
        int n = height.length;

        //leftmax
        int leftmax[] = new int[n];
        for(int i=1; i<n; i++){
            leftmax[0] = height[0];
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //rightmax
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }
        //loop
        for(int i=1; i<n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapWater += (waterlevel - height[i]) * width;
        }
        return trapWater;
    }
    public static void main(String[] args){
        int height[] = {4,2,0,3,2,5};
        int width = 1;
        System.out.println(trappedWater(height,width));
    }
}
