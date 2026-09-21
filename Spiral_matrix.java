public class Spiral_matrix {
    public static void main(String[] args) {
        int n = 5; // You can change this to any size
        int[][] matrix = new int[n][n];

        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Left to Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
        }

        // Print the matrix
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%3d ", num);
            }
            System.out.println();
        }
    }
}