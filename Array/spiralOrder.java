import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n - 1;
        int top = 0, bottom = m - 1;
        List<Integer> ans = new ArrayList<>();

        while (left <= right && top <= bottom) {
            // Traverse from left to right across the top row
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;  // Move the top boundary down
            
            // Traverse down the rightmost column
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;  // Move the right boundary left
            
            if (top <= bottom) {
                // Traverse from right to left across the bottom row
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;  // Move the bottom boundary up
            }
            
            if (left <= right) {
                // Traverse up the leftmost column
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;  // Move the left boundary right
            }
        }
        return ans;
    }
}
