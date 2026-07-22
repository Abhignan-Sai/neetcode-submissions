class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;
        while(left<right)
        {
            int width = right-left;
            int bottleneckHeight = Math.min(heights[left],heights[right]);
            int area = width * bottleneckHeight;

            maxArea = Math.max(maxArea,area);

            // now move the shorter wall
            if(heights[left]<heights[right]) left++;
            else right--;
        }
        return maxArea;

        
    }
}
