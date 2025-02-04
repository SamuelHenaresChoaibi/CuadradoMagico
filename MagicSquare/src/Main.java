import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menuPrincipal();
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
            System.out.println("\n\n--------------MAGIC SQUARE--------------");
            System.out.println("0. Exit");
            System.out.println("1. Generate a Random Normal Matrix");
            System.out.println("2. Generate a Random Magic Square");
            System.out.println("3. Write matrix");
            System.out.println("4. Show matrix");
            System.out.println("5. Check Magic Square");
            System.out.println("6. Change length");
            System.out.println("7. Change position value of the matrix");
            System.out.println("8. Sum of numbers in a row");
            System.out.println("9. Sum of numbers in a column");
            System.out.print("\nChoose an option: ");
            op = scan.next().charAt(0);

            switch (op) {
                case '0':
                    System.out.println("Bye World!");
                    System.exit(1);
                    break;

                case '1':
                    matrix.generateNoMagicNewMatrixRandom();
                    break;

                case '2':
                    matrix.generateMagicSquareRandom();
                    break;

                case '3':
                    matrix.writeMatrix();
                    break;

                case '4':
                    System.out.println("\n\n--------------SHOW MATRIX--------------");
                    matrix.print();
                    break;

                case '5':
                    matrix.checkMagicSquare();
                    break;

                case '6':
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

                case '7':
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

                case '8':
                    System.out.println("\n\n--------------SUM OF NUMBERS IN A ROW--------------");
                    matrix.print();
                    int row;
                    do {
                        System.out.print("\nPut the row you want to sum (0 - " + (matrix.getLongMatrix()-1) + "): ");
                        row = scan.nextInt();
                    } while (row < 0 || row >= matrix.getLongMatrix());
                    System.out.println("\nTotal sum of the row " + row + ": " + matrix.sumRow(row));
                    break;


                case '9':
                    System.out.println("\n\n--------------SUM OF NUMBERS IN A COLUMN--------------");
                    matrix.print();
                    int column;
                    do {
                        System.out.print("\nPut the column you want to sum (0 - " + (matrix.getLongMatrix()-1) + "): ");
                        column = scan.nextInt();
                    } while (column < 0 || column >= matrix.getLongMatrix());
                    System.out.println("\nTotal sum of the column " + column + ": " + matrix.sumColumn(column));
                    break;

            }

        } while (true);
    }


}