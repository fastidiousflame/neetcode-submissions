class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int areaM = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            areaM = Math.max(areaM, area);

            // Move the pointer at the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return areaM;
    }
}

