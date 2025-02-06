import java.util.Random;
import java.util.Scanner;

public class MagicSquare {
    private int longMatrix;
    private int[][] matrix;

    public MagicSquare(int longMatrix) {
        this.longMatrix = longMatrix;
        matrix = new int[longMatrix][longMatrix];
    }

    public int getLongMatrix() {
        return longMatrix;
    }

    public void setLongMatrix(int longMatrix) {
        if(longMatrix <= 0){
            longMatrix = 1;
        }
        this.longMatrix = longMatrix;
        this.matrix = new int[longMatrix][longMatrix]; // Redimensionar la matriz
    }


    //Cread un método put(int x, int y, int number) que pondrá un número en la posición indicada.
    public void put(int x, int y, int number) {
        Scanner scan = new Scanner(System.in);
        while(x > matrix.length || x < 0){
            System.out.println("Position X out of range");
            System.out.print("Introduce a valide position (0 - "+matrix.length+"): ");
            x = scan.nextInt();
        }
        while(y > matrix.length || y < 0){
            System.out.println("Position Y out of range");
            System.out.print("Introduce a valide position (0 - "+matrix.length+"): ");
            y = scan.nextInt();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == matrix[x][y]) {
                    matrix[x][y] = number;
                    break;
                }
            }
        }

    }

    //Cread un método print() que pinta el cuadrado mágico por la terminal.
    public void print() {
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

    /*
    int sumRow(int row)
    Que te devuelve el resultado de sumar todos los números de una fila.
     */
    public int sumRow(int row) {
        int sumaRow = 0;
        if(row < 0){
            row = 0;
        }else if(row > matrix.length){
            row = matrix.length - 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (row == i) {
                    sumaRow += matrix[i][j];
                }
            }
        }
        return sumaRow;
    }

    /*
    int sumColumn(int column)
     */
    public int sumColumn(int column) {
        int sumaColumn = 0;
        if(column < 0){
            column = 0;
        }else if(column > matrix.length){
            column = matrix.length - 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (column == j) {
                    sumaColumn += matrix[i][j];
                }
            }
        }
        return sumaColumn;
    }

    /*
    int sumRow(int row)
     */

    public int sumMainDiagonal() {
        int sumaMainDiag = 0, longitud = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumaMainDiag += matrix[i][longitud];
            longitud++;
        }
        return sumaMainDiag;
    }


    /*
    int sumRow(int row)
    Que te devuelve el resultado de sumar todos los números de una fila.
     */
    public int sumSecundaryDiagonal() {
        int sumaSecundDiag = 0;
        int longitud = matrix.length-1;
        for (int i = 0; i < matrix.length; i++) {
            sumaSecundDiag += matrix[i][longitud - i];
        }
        return sumaSecundDiag;
    }

    public void generateNoMagicNewMatrixRandom() {
        System.out.println("\n\n--------------RANDOM MATRIX--------------");
        Random ran = new Random();
        System.out.println("\nNormal Matrix (No magic)");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = ran.nextInt(0, matrix.length * matrix.length);
            }
        }
    }

    public void generateMagicSquareRandom() {
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
            comp = validate();
        }
    }


    public boolean validate() {
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




}