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
            System.out.print("\nChoose an option: ");
            op = scan.next().charAt(0);

            switch (op) {
                case '0':
                    System.out.println("Bye World!");
                    System.exit(1);
                    break;

                case '1':
                    MagicSquare.printNoMagicNewMatrixRandom();
                    break;

                case '2':
                    MagicSquare.printMagicSquareRandom();
                    break;

                case '3':
                    MagicSquare.writeMatrix();
                    break;

                case '4':
                    MagicSquare.showMatrix();
                    break;

                case '5':
                    MagicSquare.checkMagicSquare();
                    break;

                case '6':
                    do {
                        System.out.println("¿Are you sure? The matrix will be eliminated (Y/N)");
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
                    MagicSquare.changeValuePosition();
                    break;

            }

        } while (true);


    }
}