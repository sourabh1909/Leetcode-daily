public class trappingWater {
    public int trap(int[] height) {
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        int n = height.length;

        int maxWater = 0;
        leftMax[0] = height[0]; 
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        rightMax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        int waterLevel = 0;

        for(int i = 0;i<n;i++){
            waterLevel = Math.min(leftMax[i],rightMax[i]);

            maxWater += waterLevel-height[i];
        }

        return maxWater;
    }
}