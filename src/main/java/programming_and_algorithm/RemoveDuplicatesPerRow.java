package programming_and_algorithm;

public class RemoveDuplicatesPerRow {


    public static void main(String[] args) {
        // Sample input
        int[][] input = {
                {1, 3, 2, 2, 3, 4, 4, 3, 5},
                {1, 1, 2, 1, 2, 1, 1}
        };

        // Remove duplicates per row
        int[][] result = removeDuplicates(input);

        // Print output
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] removeDuplicates(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];

            // Create an array to store "seen" values (use a large enough size)
            // Assumes max input values are within reasonable bounds (0 to 100000)
            int max = 100001; // You can dynamically compute max if needed
            int[] seen = new int[max];

            for (int j = 0; j < row.length; j++) {
                int val = row[j];

                if (seen[val] == 0) {
                    // First time seeing the number, mark as seen
                    seen[val] = 1;
                } else {
                    // Duplicate, replace with 0
                    row[j] = 0;
                }
            }
        }
        return matrix;
    }


}
