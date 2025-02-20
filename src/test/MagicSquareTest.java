/**
 * Cread la clase de MagicSquareTest que contenga las pruebas unitarias que consideréis necesarias
 * usando JUnit 5 y siguiendo los contenidos y recomendaciones que hemos visto durante las clases
 * teóricas.
 *
 * @samuelhenareschoaibi
 */

import org.junit.jupiter.api.*;

class MagicSquareTest {
    MagicSquare matrix = new MagicSquare(2);
    boolean isMagic;


    //Método "getLongMatrix()"
    @Test
    @Tag("positiveTesting")
    @Order(0)
    void getLongMatrix3x3() {
        matrix.setLongMatrix(3);
        System.out.println("Matrix long: " + matrix.getLongMatrix());
        matrix.print();
        System.out.println("\n\n");
    }

    @Test
    @Tag("positiveTesting")
    @Order(1)
    void getLongMatrix5x5() {
        matrix.setLongMatrix(5);
        System.out.println("Matrix long: " + matrix.getLongMatrix());
        matrix.print();
        System.out.println("\n\n");
    }

    @Test
    @Tag("positiveTesting")
    @Order(2)
    void getLongMatrix7x7() {
        matrix.setLongMatrix(7);
        System.out.println("Matrix long: " + matrix.getLongMatrix());
        matrix.print();
        System.out.println("\n\n");

    }

    //Método "setLongMatrix()"
    @Test
    @Tag("negativeTesting")
    @Order(3)
    void setLongMatrixOutOfRange1() {
        matrix.setLongMatrix(-1);
        matrix.print();
        System.out.println("\n\n");

    }

    @Test
    @Tag("negativeTesting")
    @Order(4)
    void setLongMatrixOutOfRange3() {
        matrix.setLongMatrix(-3);
        matrix.print();
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(5)
    void setLongMatrix3x3() {
        matrix.setLongMatrix(3);
        matrix.print();
        System.out.println("\n\n");

    }

    @DisplayName("setLongMatrix5x5")
    @Test
    @Tag("positiveTesting")
    @Order(6)
    void setLongMatrix5x5() {
        matrix.setLongMatrix(5);
        matrix.print();
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(7)
    void setLongMatrix7x7() {
        matrix.setLongMatrix(7);
        matrix.print();
        System.out.println("\n\n");

    }

    //Método "getMatrix()"
    @Test
    @Tag("zeroTesting")
    void getMatrixZeroLong() {
        int[][] tempMatrix = new int[0][0];
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        tempMatrix = matrix.getMatrix();
    }

    @Test
    @Tag("disabledTests")
    @Tag("negativeTesting")
    @Disabled
    //No se puede poner longitudes negativas
    void getMatrixNegativeLong() {
        int[][] tempMatrix = new int[-3][-3];
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        tempMatrix = matrix.getMatrix();
    }

    @Test
    @Tag("positiveTesting")
    void getMatrixPositiveLong() {
        int[][] tempMatrix = new int[0][0];
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        tempMatrix = matrix.getMatrix();
    }

    //Método "setMatrix()"
    @Test
    @Tag("zeroTesting")
    void setMatrixZeroLong() {
        int[][] tempMatrix = new int[0][0];
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        matrix.setMatrix(tempMatrix);
        matrix.print();
    }

    @Test
    @Tag("disabledTests")
    @Disabled
    //No se puede añadir longitudes negativas
    void setMatrixNegativeLong() {
        int[][] tempMatrix = new int[-3][-3];
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        matrix.setMatrix(tempMatrix);
        matrix.print();
    }

    @Test
    @Tag("positiveTesting")
    void setMatrixPositiveLong() {
        int[][] tempMatrix = new int[3][3];
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        matrix.setMatrix(tempMatrix);
        matrix.print();
    }

    //Método "genearteMagicSquareRandom()"
    @Test
    @Tag("negativeTesting")
    void generateMagicSquareRandomNegativeValue() {
        matrix.setLongMatrix(-1);
        matrix.generateMagicSquareRandom();
        matrix.print();
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(8)
    void generateMagicSquareRandom2x2() {
        matrix.setLongMatrix(2);
        matrix.generateMagicSquareRandom();
        matrix.print();
        System.out.println("\n\n");

    }


    @Test
    @Tag("positiveTesting")
    @Order(9)
    void generateMagicSquareRandom3x3() {
        matrix.setLongMatrix(3);
        matrix.generateMagicSquareRandom();
        matrix.print();
        System.out.println("\n\n");

    }

    //Deshabilitado, ya que está bien pero tarda en procesar
    @Disabled
    @Test
    @Tag("disabledTests")
    @Order(10)
    void generateMagicSquareRandom6x6() {
        matrix.setLongMatrix(0);
        matrix.generateMagicSquareRandom();
        matrix.print();
        System.out.println("\n\n");


    }


    //Método "put()"
    @DisplayName("'putPosition0x0()'")
    @Test
    @Tag("positiveTesting")
    @Order(11)
    void putPosition0x0() {
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        matrix.put(0, 0, 4);
        System.out.println("\n\n");
        matrix.print();
        System.out.println("\n\n");

    }

    @Disabled
    @Test
    @Tag("disabledTests")
    @Order(12)
    void putPositionXOutOfRange1() {
        matrix.setLongMatrix(3);
        matrix.print();
        matrix.put(7, 2, 4);
        System.out.println("\n\n");
        matrix.print();
        System.out.println("\n\n");


    }

    @Test
    @Tag("negativeTesting")
    @Order(13)
    void putPositionYOutOfRange1() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        matrix.put(2, 7, 4);
        System.out.println("\n\n");
        matrix.print();
        System.out.println("\n\n");

    }

    @Test
    @Tag("negativeTesting")
    @Order(14)
    void putPositionXOutOfRange2() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        matrix.put(-3, 2, 4);
        System.out.println("\n\n");
        matrix.print();
        System.out.println("\n\n");

    }

    @Test
    @Tag("negativeTesting")
    @Order(15)
    void putPositionYOutOfRange2() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        matrix.put(2, -3, 4);
        System.out.println("\n\n");
        matrix.print();
        System.out.println("\n\n");

    }


    //Método "print()"
    @Test
    @Tag("positiveTesting")
    @Order(16)
    void print1x1() {
        matrix.setLongMatrix(1);
        matrix.print();
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(17)
    void print2x2() {
        matrix.setLongMatrix(2);
        matrix.print();
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(18)
    void print3x3() {
        matrix.setLongMatrix(3);
        matrix.print();
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(19)
    void print4x4() {
        matrix.setLongMatrix(4);
        matrix.print();
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(20)
    void print7x7() {
        matrix.setLongMatrix(7);
        matrix.print();
        System.out.println("\n\n");

    }

    @Test
    @Tag("negativeTesting")
    @Order(21)
    void printNegativeNumber() {
        matrix.setLongMatrix(-4);
        matrix.print();
        System.out.println("\n\n");

    }

    //Método "sumColumn()"
    @Test
    @Tag("negativeTesting")
    @Order(22)
    void sumColumnOutOfRange1() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumColumn(-1));
        System.out.println("\n\n");

    }

    @Test
    @Tag("negativeTesting")
    @Order(23)
    void sumColumnOutOfRange2() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumColumn(4));
        System.out.println("\n\n");

    }


    @Test
    @Tag("positiveTesting")
    @Order(24)
    void sumColumn2x2() {
        matrix.setLongMatrix(2);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumColumn(1));
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(25)
    void sumColumn5x5() {
        matrix.setLongMatrix(5);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumColumn(3));
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(26)
    void sumColumn7x7() {
        matrix.setLongMatrix(7);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumColumn(5));
        System.out.println("\n\n");

    }

    //Método "sumRow()"
    @Test
    @Tag("negativeTesting")
    @Order(27)
    void sumRowOutOfRange1() {
        matrix.setLongMatrix(3);
        matrix.generateMagicSquareRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumRow(-1));
        System.out.println("\n\n");

    }

    @Test
    @Tag("negativeTesting")
    @Order(28)
    void sumRowOutOfRange2() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumRow(4));
        System.out.println("\n\n");

    }


    @Test
    @Tag("positiveTesting")
    @Order(29)
    void sumRow2x2() {
        matrix.setLongMatrix(2);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumRow(1));
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(30)
    void sumRow5x5() {
        matrix.setLongMatrix(5);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumRow(3));
        System.out.println("\n\n");

    }


    @Test
    @Tag("positiveTesting")
    @Order(31)
    void sumRow7x7() {
        matrix.setLongMatrix(7);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumRow(5));
        System.out.println("\n\n");

    }

    //Método "sumMainDiagonal()"
    @Test
    @Tag("positiveTesting")
    @Order(32)
    void sumMainDiagonal2x2() {
        matrix.setLongMatrix(2);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println(matrix.sumMainDiagonal());
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(33)
    void sumMainDiagonal4x4() {
        matrix.setLongMatrix(4);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println(matrix.sumMainDiagonal());
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(34)
    void sumMainDiagonal7x7() {
        matrix.setLongMatrix(7);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println(matrix.sumMainDiagonal());
        System.out.println("\n\n");

    }

    @Test
    @Tag("negativeTesting")
    @Order(35)
    void sumMainDiagonalOutOfRange3() {
        matrix.setLongMatrix(-3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println(matrix.sumMainDiagonal());
        System.out.println("\n\n");

    }


    //Método "sumSecundaryDiagonal()"
    @Test
    @Tag("positiveTesting")
    @Order(36)
    void sumSecundaryDiagonal4x4() {
        matrix.setLongMatrix(4);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println(matrix.sumSecundaryDiagonal());
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(37)
    void sumSecundaryDiagonal7x7() {
        matrix.setLongMatrix(7);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println(matrix.sumSecundaryDiagonal());
        System.out.println("\n\n");

    }

    @Test
    @Tag("negativeTesting")
    @Order(38)
    void sumSecundaryDiagonalOutOfRange3() {
        matrix.setLongMatrix(-3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println(matrix.sumSecundaryDiagonal());
        System.out.println("\n\n");

    }

    //Método "validate()"
    @Test
    @Tag("positiveTesting")
    @Order(37)
    void validateNotMagicSquare3x3() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        isMagic = matrix.validate();
        if (isMagic) {
            System.out.println("The Square is Magic");
        } else {
            System.out.println("The Square is not Magic");
        }
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(38)
    void validateMagicSquare3x3() {
        matrix.setLongMatrix(3);
        matrix.generateMagicSquareRandom();
        isMagic = matrix.validate();
        if (isMagic) {
            System.out.println("The Square is Magic");
        } else {
            System.out.println("The Square is not Magic");
        }
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(39)
    void validateNotMagicSquare4x4() {
        matrix.setLongMatrix(4);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        isMagic = matrix.validate();
        if (isMagic) {
            System.out.println("The Square is Magic");
        } else {
            System.out.println("The Square is not Magic");
        }
        System.out.println("\n\n");

    }

    @Disabled
    @Test
    @Tag("disabledTests")
    @Order(40)
    void validateMagicSquare4x4All2() {
        matrix.setLongMatrix(4);
        for (int i = 0; i < matrix.getLongMatrix(); i++) {
            for (int j = 0; j < matrix.getLongMatrix(); j++) {
                matrix.put(i, j, 2);
            }
        }
        matrix.print();
        isMagic = matrix.validate();
        if (isMagic) {
            System.out.println("The Square is Magic");
        } else {
            System.out.println("The Square is not Magic");
        }
        System.out.println("\n\n");

    }

    @Test
    @Tag("positiveTesting")
    @Order(41)
    void validateNotMagicSquare5x5() {
        matrix.setLongMatrix(5);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        isMagic = matrix.validate();
        if (isMagic) {
            System.out.println("The Square is Magic");
        } else {
            System.out.println("The Square is not Magic");
        }
        System.out.println("\n\n");

    }

    @Disabled
    @Test
    @Tag("disabledTests")
    @Order(42)
    void validateMagicSquare5x5All2() {
        matrix.setLongMatrix(5);
        for (int i = 0; i < matrix.getLongMatrix(); i++) {
            for (int j = 0; j < matrix.getLongMatrix(); j++) {
                matrix.put(i, j, 2);
            }
        }
        matrix.print();
        isMagic = matrix.validate();
        if (isMagic) {
            System.out.println("The Square is Magic");
        } else {
            System.out.println("The Square is not Magic");
        }
        System.out.println("\n\n");
    }
}