
public class container {
     public int maxArea(int[] height) {
        int area = 0;
        int lp = 0;
        int rp = height.length-1;

        int maxWater = 0;

        while(lp < rp){
            int width = rp - lp;
            int hei = Math.min(height[lp],height[rp]);

            area = width*hei;
            maxWater = Math.max(maxWater,area);
            if(height[lp] < height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
}
