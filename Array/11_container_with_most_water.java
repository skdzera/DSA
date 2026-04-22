class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxarea=0;

        while(left<=right){
            
            int h = Math.min(height[left],height[right]);
            int area = (right-left)*h;

            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
            maxarea = Math.max(area,maxarea);

        }
        return maxarea;
    }
}
