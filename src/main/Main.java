/**
 * Clase main del MagicSquare
 *
 * @samuelhenareschoaibi
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            menuPrincipal();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    private static void menuPrincipal() {
        Scanner scan = new Scanner(System.in);
        char op = 0, opChar;
        int longMatriz;
        System.out.println("--------------LENGTH--------------");
        do {
            System.out.print("Assigns a length to the matrix: ");
            longMatriz = scan.nextInt();
        } while (longMatriz < 0);
        MagicSquare matrix = new MagicSquare(longMatriz);
        matrix.setLongMatrix(longMatriz);
        do {
            System.out.println("\n\n--------------MAGIC SQUARE MENU--------------");
            System.out.println("0. Exit");
            System.out.println("1. Generate a Random Normal Matrix");
            System.out.println("2. Generate a Random Magic Square");
            System.out.println("3. Show matrix");
            System.out.println("4. Check Magic Square");
            System.out.println("5. Change length");
            System.out.println("6. Change position value of the matrix");
            System.out.println("a. Sum of numbers in a row");
            System.out.println("b. Sum of numbers in a column");
            System.out.println("c. Sum Main Diagonal");
            System.out.println("d. Sum Secundary Diagonal");
            System.out.print("\nChoose an option: ");
            op = scan.next().charAt(0);

            switch (op) {
                case '0':
                    System.out.println("Bye World!");
                    System.exit(1);
                    break;

                case '1':
                    System.out.println("\n\n--------------RANDOM MATRIX--------------");
                    System.out.println("\nNormal Matrix (No magic)");
                    matrix.generateNoMagicNewMatrixRandom();
                    break;

                case '2':
                    System.out.println("\n\n--------------RANDOM MAGIC SQUARE--------------");
                    System.out.println("\nMagic Square Random:");
                    matrix.generateMagicSquareRandom();
                    break;

                case '3':
                    System.out.println("\n\n--------------SHOW MATRIX--------------");
                    matrix.print();
                    break;

                case '4':
                    boolean isMagic;
                    System.out.println("\n\n--------------CHECK IF IT'S A MAGIC SQUARE--------------");
                    isMagic = matrix.validate();
                    if (isMagic) {
                        System.out.println("The Square is Magic");
                    } else {
                        System.out.println("The Square is not Magic");
                    }
                    break;

                case '5':
                    do {
                        System.out.print("¿Are you sure? The matrix will be eliminated (Y/N): ");
                        opChar = scan.next().charAt(0);
                    } while (opChar != 'Y' && opChar != 'y' && opChar != 'N' && opChar != 'n');

                    switch (opChar) {
                        case 'y', 'Y':
                            System.out.println("--------------LENGTH--------------");
                            System.out.print("Assigns a length to the matrix: ");
                            longMatriz = scan.nextInt();
                            matrix.setLongMatrix(longMatriz);
                            break;

                        default:
                            break;
                    }

                case '6':
                    System.out.println("\n\n--------------CHANGE VALUE POSITION--------------");
                    int value, x, y;
                    matrix.print();
                    System.out.println("Take a position (X,Y)");
                    do {
                        System.out.print("X: ");
                        x = scan.nextInt();
                    } while (x > 0 || x >= matrix.getLongMatrix());

                    do {
                        System.out.print("Y: ");
                        y = scan.nextInt();
                    } while (y > 0 || y >= matrix.getLongMatrix());
                    System.out.print("\nPut a value for the position " + x + ", " + y + ": ");
                    int number = scan.nextInt();
                    matrix.put(x, y, number);
                    matrix.print();
                    break;

                case 'a', 'A':
                    System.out.println("\n\n--------------SUM OF NUMBERS IN A ROW--------------");
                    matrix.print();
                    int row;
                    do {
                        System.out.print("\nPut the row you want to sum (0 - " + (matrix.getLongMatrix() - 1) + "): ");
                        row = scan.nextInt();
                    } while (row < 0 || row >= matrix.getLongMatrix());
                    System.out.println("\nTotal sum of the row " + row + ": " + matrix.sumRow(row));
                    break;


                case 'b', 'B':
                    System.out.println("\n\n--------------SUM OF NUMBERS IN A COLUMN--------------");
                    matrix.print();
                    int column;
                    do {
                        System.out.print("\nPut the column you want to sum (0 - " + (matrix.getLongMatrix() - 1) + "): ");
                        column = scan.nextInt();
                    } while (column < 0 || column >= matrix.getLongMatrix());
                    System.out.println("\nTotal sum of the column " + column + ": " + matrix.sumColumn(column));
                    break;

                case 'c', 'C':
                    System.out.println("\n\n--------------SUM OF NUMBERS OF MAIN DIGONAL--------------");
                    System.out.println("Total sum of main diagonal: " + matrix.sumMainDiagonal());

                case 'd', 'D':
                    System.out.println("\n\n--------------SUM OF NUMBERS OF SECUNDARY DIGONAL--------------");
                    System.out.println("Total sum of secundary diagonal: " + matrix.sumSecundaryDiagonal());

            }

        } while (true);
    }


}