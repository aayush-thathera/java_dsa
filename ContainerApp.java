public class ContainerApp {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        
        WaterContainer wc = new WaterContainer();
        int maxArea = wc.calculateMaxArea(height);
        
        System.out.println("Maximum Water Container Area: " + maxArea);
    }
}

class WaterContainer {
    public int calculateMaxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
