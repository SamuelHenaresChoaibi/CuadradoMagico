/**
 * Un cuadrado mágico es una tabla con una serie de números enteros de tal forma que la suma de los
 * números por columnas, filas y diagonales es la misma.
 * Por ejemplo, dada la siguiente tabla de 3x3, podemos ver que lo es ya que la suma de los números
 * en filas, columnas o diagonales es 15.
 * | 4 9 2 |
 * | 3 5 7 |
 * | 8 1 6 |
 *
 * Descripción del problema a solucionar
 * Se trata de realizar una aplicación en Java capaz de analizar si una matriz cuadrada de MxN es un
 * cuadrado mágico, presentando un breve informe al usuario por la terminal.
 * Para ello deberá cumplir los requisitos:
 *
 * - Cread un nuevo proyecto “CuadradoMagico” usando el IDE Intellij IDEA Community Edition y el
 * Oracle OpenJDK 23.
 * - Cread una clase MagicSquare que encapsulará un atributo privado, que serà un array
 * bidimensional de números.
 *
 * En la clase MagicSquare que devolverá verdadero si en la tabla se cumplen las condiciones de un
 * cuadrado mágico y falso en caso contrario. Tened en cuenta, que este método debe ser eficaz en
 * cálculo de tal forma que mientras dure el proceso de comprobación, si ya se ha detectado alguna
 * fila, columna o diagonal diferente al resto, el proceso se debería interrumpir.
 *
 * @samuelhenareschoaibi
 */

import java.util.Random;

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
        if (longMatrix <= 0) {
            longMatrix = 1;
        }
        this.longMatrix = longMatrix;
        this.matrix = new int[longMatrix][longMatrix]; // Redimensionar la matriz
    }


    /**
     * Cread un método put(int x, int y, int number) que pondrá un número en la posición indicada.
     *
     * @param x
     * @param y
     * @param number
     */
    public void put(int x, int y, int number) {
        if (x < 0) {
            System.out.println("Position X out of range (X < 0)");
            System.out.print("Predeterminated value -> X = 0");
            x = 0;
        } else if (x >= matrix.length) {
            System.out.println("Position X out of range (X > Length Matrix)");
            System.out.print("Predeterminated value -> X = " + (getLongMatrix() - 1));
            x = getLongMatrix() - 1;
        }

        if (y < 0) {
            System.out.println("Position Y out of range (Y < 0)");
            System.out.print("Predeterminated value -> Y = 0");
            y = 0;
        } else if (y >= matrix.length) {
            System.out.println("Position Y out of range (Y > Length Matrix)");
            System.out.print("Predeterminated value -> Y = " + getLongMatrix());
            y = getLongMatrix() - 1;
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


    /**
     * Cread un método print() que pinta el cuadrado mágico por la terminal.
     */
    public void print() {
        if (matrix == null) {
            System.out.println("La matriz no está definida");
            return;
        }

        try {
            for (int[] i : matrix) {
                System.out.print("| ");
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(" " + i[j] + " ");
                }
                System.out.print(" |\n");
            }
        } catch (Exception e) {
            System.out.println("Error al imprimir la matriz: " + e.getMessage());
        }
    }


    /**
     * int sumRow(int row)
     *
     * Que te devuelve el resultado de sumar todos los números de una fila.
     *
     * @param row
     * @return
     */
    public int sumRow(int row) {
        int sumaRow = 0;
        if (row < 0) {
            row = 0;
        } else if (row > matrix.length) {
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

    /**
     * int sumColumn(int column)
     *
     * Que te devuelve el resultado de sumar todos los números de una columna.
     *
     * @param column
     * @return
     */
    public int sumColumn(int column) {
        int sumaColumn = 0;
        if (column < 0) {
            column = 0;
        } else if (column > matrix.length) {
            column = matrix.length - 1;
        }
        for (int[] i : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (column == j) {
                    sumaColumn += i[j];
                }
            }
        }
        return sumaColumn;
    }


    /**
     * Cread un método sumMainDiagonal()
     *
     * Que te devuelve el resultado de sumar todos los números de la diagonal principal:
     * @return
     */
    public int sumMainDiagonal() {
        int sumaMainDiag = 0, longitud = 0;
        for (int[] ints : matrix) {
            sumaMainDiag += ints[longitud];
            longitud++;
        }
        return sumaMainDiag;
    }


    /**
     * Cread un método sumSecundaryDiagonal()
     *
     * Que te devuelve el resultado de sumar todos los números de la diagonal secundaria:
     *
     * @return
     */
    public int sumSecundaryDiagonal() {
        int sumaSecundDiag = 0;
        int longitud = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            sumaSecundDiag += matrix[i][longitud - i];
        }
        return sumaSecundDiag;
    }

    /**
     * public void generateNoMagicNewMatrixRandom()
     *
     * Genera una matriz aleatorio sin la necesidad de que sea mágico
     *
     */
    public void generateNoMagicNewMatrixRandom() {
        Random ran = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = ran.nextInt(0, matrix.length * matrix.length);
            }
        }
    }

    /**
     * public void generateMagicSquareRandom()
     *
     * Genera una matriz aleatorio que si o si será cuadrada.
     *
     */
    public void generateMagicSquareRandom() {
        Random ran = new Random();
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


    /**
     * public bool validate()
     *
     * En la clase MagicSquare que devolverá verdadero si en la tabla se cumplen las condiciones de un
     * cuadrado mágico y falso en caso contrario. Tened en cuenta, que este método debe ser eficaz en
     * cálculo de tal forma que mientras dure el proceso de comprobación, si ya se ha detectado alguna
     * fila, columna o diagonal diferente al resto, el proceso se debería interrumpir.
     *
     * @return
     */
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