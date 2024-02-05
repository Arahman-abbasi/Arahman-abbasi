public class Lab2 {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public static double[][] transposeCopy(double[][] matrix) {
        double[][] rv = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rv[j][i] = matrix[i][j];
            }
        }
        return rv;
    }
}
