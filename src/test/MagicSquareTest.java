class MagicSquareTest {
    MagicSquare matrix = new MagicSquare(2);
    boolean isMagic;


    //Método "getLongMatrix()"
    @org.junit.jupiter.api.Test
    void getLongMatrix3x3() {
        matrix.setLongMatrix(3);
        System.out.println("Matrix long: " + matrix.getLongMatrix());
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void getLongMatrix5x5() {
        matrix.setLongMatrix(5);
        System.out.println("Matrix long: " + matrix.getLongMatrix());
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void getLongMatrix7x7() {
        matrix.setLongMatrix(7);
        System.out.println("Matrix long: " + matrix.getLongMatrix());
        matrix.print();
    }

    //Método "setLongMatrix()"
    @org.junit.jupiter.api.Test
    void setLongMatrixOutOfRange1() {
        matrix.setLongMatrix(-1);
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void setLongMatrixOutOfRange3() {
        matrix.setLongMatrix(-3);
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void setLongMatrix3x3() {
        matrix.setLongMatrix(3);
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void setLongMatrix5x5() {
        matrix.setLongMatrix(5);
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void setLongMatrix7x7() {
        matrix.setLongMatrix(7);
        matrix.print();
    }


    //Método "genearteMagicSquareRandom()"

    @org.junit.jupiter.api.Test
    void generateMagicSquareRandom2x2() {
        matrix.setLongMatrix(2);
        matrix.generateMagicSquareRandom();
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void generateMagicSquareRandom3x3() {
        matrix.setLongMatrix(3);
        matrix.generateMagicSquareRandom();
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void generateNoMagicNewMatrixRandom6x6() {
        matrix.setLongMatrix(6);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
    }


    //Método "put()"
    @org.junit.jupiter.api.Test
    void putPosition0x0() {
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        matrix.put(0, 0, 4);
        System.out.println("\n");
        matrix.print();
    }


    @org.junit.jupiter.api.Test
    void putPositionXOutOfRange1() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        matrix.put(7, 2, 4);
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void putPositionYOutOfRange1() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        matrix.put(2, 7, 4);
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void putPositionXOutOfRange2() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        matrix.put(-3, 2, 4);
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void putPositionYOutOfRange2() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        matrix.put(2, -3, 4);
        matrix.print();
    }



    //Método "print()"
    @org.junit.jupiter.api.Test
    void print1x1() {
        matrix.setLongMatrix(1);
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void print2x2() {
        matrix.setLongMatrix(2);
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void print3x3() {
        matrix.setLongMatrix(3);
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void print4x4() {
        matrix.setLongMatrix(4);
        matrix.print();
    }

    @org.junit.jupiter.api.Test
    void print7x7() {
        matrix.setLongMatrix(7);
        matrix.print();
    }

    //Método "sumColumn()"
    @org.junit.jupiter.api.Test
    void sumColumnOutOfRange1() {
        matrix.setLongMatrix(3);
        matrix.generateMagicSquareRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumColumn(-1));
    }

    @org.junit.jupiter.api.Test
    void sumColumnOutOfRange2() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumColumn(4));
    }


    @org.junit.jupiter.api.Test
    void sumColumn2x2() {
        matrix.setLongMatrix(2);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumColumn(1));
    }

    @org.junit.jupiter.api.Test
    void sumColumn5x5() {
        matrix.setLongMatrix(5);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumColumn(3));
    }

    @org.junit.jupiter.api.Test
    void sumColumn7x7() {
        matrix.setLongMatrix(7);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumColumn(5));
    }

    //Método "sumRow()"
    @org.junit.jupiter.api.Test
    void sumRowOutOfRange1() {
        matrix.setLongMatrix(3);
        matrix.generateMagicSquareRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumRow(-1));
    }

    @org.junit.jupiter.api.Test
    void sumRowOutOfRange2() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumRow(4));
    }


    @org.junit.jupiter.api.Test
    void sumRow2x2() {
        matrix.setLongMatrix(2);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumRow(1));
    }

    @org.junit.jupiter.api.Test
    void sumRow5x5() {
        matrix.setLongMatrix(5);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumRow(3));
    }

    @org.junit.jupiter.api.Test
    void sumRow7x7() {
        matrix.setLongMatrix(7);
        matrix.generateNoMagicNewMatrixRandom();
        matrix.print();
        System.out.println("\n" + matrix.sumRow(5));
    }

    //Método "sumMainDiagonal()"
    @org.junit.jupiter.api.Test
    void sumMainDiagonal() {
        matrix.sumMainDiagonal();
    }

    //Método "sumSecundaryDiagonal()"
    @org.junit.jupiter.api.Test
    void sumSecundaryDiagonal() {
        matrix.sumSecundaryDiagonal();
    }

    //Método "validate()"
    @org.junit.jupiter.api.Test
    void validateNotMagicSquare3x3() {
        matrix.setLongMatrix(3);
        matrix.generateNoMagicNewMatrixRandom();
        isMagic = matrix.validate();
        if (isMagic) {
            System.out.println("The Square is Magic");
        } else {
            System.out.println("The Square is not Magic");
        }
    }

    @org.junit.jupiter.api.Test
    void validateMagicSquare3x3() {
        matrix.setLongMatrix(3);
        matrix.generateMagicSquareRandom();
        isMagic = matrix.validate();
        if (isMagic) {
            System.out.println("The Square is Magic");
        } else {
            System.out.println("The Square is not Magic");
        }
    }

    @org.junit.jupiter.api.Test
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
    }

    @org.junit.jupiter.api.Test
    void validateMagicSquare4x4() {
        matrix.setLongMatrix(4);
        matrix.generateMagicSquareRandom();
        matrix.print();
        isMagic = matrix.validate();
        if (isMagic) {
            System.out.println("The Square is Magic");
        } else {
            System.out.println("The Square is not Magic");
        }
    }

    @org.junit.jupiter.api.Test
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
    }

    @org.junit.jupiter.api.Test
    void validateMagicSquare5x5() {
        matrix.setLongMatrix(5);
        matrix.generateMagicSquareRandom();
        matrix.print();
        isMagic = matrix.validate();
        if (isMagic) {
            System.out.println("The Square is Magic");
        } else {
            System.out.println("The Square is not Magic");
        }
    }
}