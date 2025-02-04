import java.util.Random;
import java.util.Scanner;

public class MagicSquare {
    private static int longMatrix;
    private static int[][] matrix;

    public MagicSquare(int longMatrix) {
        MagicSquare.longMatrix = longMatrix;
        matrix = new int[MagicSquare.longMatrix][MagicSquare.longMatrix];
    }

    public int getLongMatrix() {
        return longMatrix;
    }

    public void setLongMatrix(int longMatrix) {
        this.longMatrix = longMatrix;
    }

    public static void showMatrix() {
        System.out.println("\n\n--------------SHOW MATRIX--------------");
        if (matrix == null) {
            System.out.println("La matriz no está definida");

        } else {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(" " + matrix[i][j] + " ");
                }
                System.out.print(" |\n");
            }
        }
    }

    public static void printNoMagicNewMatrixRandom() {
        System.out.println("\n\n--------------RANDOM MATRIX--------------");
        Random ran = new Random();
        System.out.println("\nNormal Matrix (No magic)");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = ran.nextInt(0, 9);
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print(" |\n");
        }
    }

    public static void printMagicSquareRandom() {
        System.out.println("\n\n--------------RANDOM MAGIC SQUARE--------------");
        Random ran = new Random();
        System.out.println("\nMagic Square Random:");
        boolean comp = false;
        while (!comp) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = ran.nextInt(0, matrix.length * matrix.length);
                }
            }
            comp = boolMagicSquare();
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print(" |\n");
        }
    }

    public static boolean boolMagicSquare() {
        int n = matrix.length;
        int[] suma = new int[2 * n + 2]; // Arreglo para almacenar sumas de filas, columnas y diagonales

        // Sumar filas y columnas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma[i] += matrix[i][j]; // Suma de filas
                suma[n + j] += matrix[i][j]; // Suma de columnas
            }
        }

        // Sumar diagonales
        for (int i = 0; i < n; i++) {
            suma[2 * n] += matrix[i][i]; // Diagonal principal
            suma[2 * n + 1] += matrix[i][n - 1 - i]; // Diagonal secundaria
        }

        // Verificar si todas las sumas son iguales
        int targetSum = suma[0];
        for (int i = 1; i < suma.length; i++) {
            if (suma[i] != targetSum) {
                return false;
            }
        }
        return true;
    }


    public static void writeMatrix() {
        System.out.println("\n\n--------------WRITE MATRIX--------------");
        int num;
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("\nPosition ("+i+", "+j+"): ");
                matrix[i][j] = scan.nextInt();
            }

        }
    }

    public static void checkMagicSquare() {
        System.out.println("\n\n--------------CHECK IF IT'S A MAGIC SQUARE--------------");

        int n = matrix.length;
        int[] suma = new int[2 * n + 2]; // Arreglo para almacenar sumas de filas, columnas y diagonales

        // Sumar filas y columnas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma[i] += matrix[i][j]; // Suma de filas
                suma[n + j] += matrix[i][j]; // Suma de columnas
            }
        }

        // Sumar diagonales
        for (int i = 0; i < n; i++) {
            suma[2 * n] += matrix[i][i]; // Diagonal principal
            suma[2 * n + 1] += matrix[i][n - 1 - i]; // Diagonal secundaria
        }

        // Verificar si todas las sumas son iguales
        int targetSum = suma[0];
        for (int i = 1; i < suma.length; i++) {
            if (suma[i] != targetSum) {
                System.out.println("The Square is not Magic");
                return;
            }
        }

        System.out.println("The Square is Magic");
    }

    public static void changeValuePosition() {
        System.out.println("\n\n--------------CHANGE VALUE POSITION--------------");
        int value, x, y;
        Scanner scan = new Scanner(System.in);
        showMatrix();
        System.out.println("Take a position (X,Y)");
        do {
            System.out.print("X: ");
            x = scan.nextInt();
        } while (x > 0 || x >= longMatrix);

        do {
            System.out.print("Y: ");
            y = scan.nextInt();
        } while (y > 0 || y >= longMatrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == matrix[x][y]) {
                    System.out.print("\nPut a value for the position " + x + ", " + y + ": ");
                    value = scan.nextInt();
                    matrix[x][y] = value;
                }
            }
        }

    }
}