import java.util.Scanner;

public class symmetric{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows/columns (Square Matrix): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // 1. Reading the matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 2. Logic to check symmetry
        boolean isSymmetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check if element at (i,j) matches (j,i)
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break; 
                }
            }
            if (!isSymmetric) break;
        }

        // 3. Output result
        if (isSymmetric) {
            System.out.println("The matrix is Symmetric.");
        } else {
            System.out.println("The matrix is NOT Symmetric.");
        }

        sc.close();
    }
}
