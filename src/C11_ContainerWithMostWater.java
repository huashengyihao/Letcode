
public class C11_ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(input));
	}
	
	public static int maxArea(int[] height) {
        int maxArea = 0;
        int curArea = 0;
        int begPos = 0;
        int endPos = height.length - 1;
        
        while (endPos != begPos) {
        	curArea = (endPos - begPos) * Math.min(height[begPos], height[endPos]);
        	if (curArea > maxArea) {
        		maxArea = curArea;
        	}
        	if (height[begPos] >= height[endPos]) {
        		endPos--;
        	} else {
        		begPos++;
        	}
        }
        
        return maxArea;
    }
}
