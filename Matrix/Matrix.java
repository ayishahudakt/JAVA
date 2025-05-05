import java.util.Scanner;

class Matrix {
    private int[][] matrix;
    private int rows, cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    public void inputMatrix(Scanner scanner) {
        System.out.println("Enter the elements row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public boolean isSymmetric() {
        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        Matrix matrix = new Matrix(rows, cols);
        matrix.inputMatrix(scanner);

        if (matrix.isSymmetric()) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

        scanner.close();
    }
}
