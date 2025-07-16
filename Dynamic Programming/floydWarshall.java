package DynamicProgrammimg;

public class floydWarshall {
    final static int INF = 100000000;

    public static void Calculate(int[][] matrix, int v) {
        for (int k = 0; k < v; k++) {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    if (matrix[i][k] < INF && matrix[k][j] < INF) {
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 3;
        int[][] matrix = {
        { 0, 3, INF, 5 },
        { 2, 0, INF, 4 },
        { INF, 1, 0, INF },
        { INF, INF, 2, 0 }
        };

        Calculate(matrix, v);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == INF) {
                    System.out.print("INF"+" ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
