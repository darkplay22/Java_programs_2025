public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        int[][] mat = {
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 },
            {13, 14, 15, 16 }
        };

        int rows = mat.length;
        int cols = mat[0].length;
        int[] spiral = new int[rows * cols];
        int index = 0;

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Left to Right
            for (int i = left; i <= right; i++) {
                spiral[index++] = mat[top][i];
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                spiral[index++] = mat[i][right];
            }
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral[index++] = mat[bottom][i];
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral[index++] = mat[i][left];
                }
                left++;
            }
        }

        // Print the spiral order
        System.out.print("Spiral Order: [");
        for (int i = 0; i < spiral.length; i++) {
            System.out.print(spiral[i]);
            if (i < spiral.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}