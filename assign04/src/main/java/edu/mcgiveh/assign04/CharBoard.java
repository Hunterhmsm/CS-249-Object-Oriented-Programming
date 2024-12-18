package edu.mcgiveh.assign04;



public class CharBoard {

    private char[][] characterArray;

    private int rows;

    private int cols;

    private char fill;

    public CharBoard(int rowCnt, int colCnt, char fillChar) {
        characterArray = new char[rowCnt][colCnt];
        rows = rowCnt;
        cols = colCnt;
        fill = fillChar;
        for (int i = 0; i < rowCnt; i++) {
            for (int j = 0; j < colCnt; j++) {
                characterArray[i][j] = fill;
            }
        }


    }

    public void clear() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                characterArray[i][j] = fill;
            }
        }
    }

    public int getRowCnt() {
        return rows;
    }

    public int getColCnt() {
        return cols;
    }

    public boolean isValidPosition(int row, int col) {
        boolean position = false;
        if ((0 <= row && row < rows) && (0 <= col && col < cols)) {
            position = true;
        }
        return position;
    }

    public char getPos(int row, int col) {
        char atPos = ' ';

        if ((0 <= row && row < rows) && (0 <= col && col < cols)) {
            atPos = characterArray[row][col];
        }
        return atPos;
    }

    public boolean setPos(int row, int col, char c) {
        boolean position = false;
        if ((0 <= row && row < rows) && (0 <= col && col < cols)) {
            characterArray[row][col] = c;
            position = true;
        }
        return position;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(rows);
        output.append(" x ");
        output.append(cols);
        output.append(" CharBoard (default: ");
        output.append(fill);
        output.append(")");

        return output.toString();
    }

    public String getMapString(){
        StringBuilder arrayOutput = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arrayOutput.append(characterArray[i][j]);
            }
            arrayOutput.append("\n");
        }
        return arrayOutput.toString();
    }
}
