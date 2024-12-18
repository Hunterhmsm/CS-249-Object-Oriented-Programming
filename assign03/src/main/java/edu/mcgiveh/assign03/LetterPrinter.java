package edu.mcgiveh.assign03;

import java.util.Scanner;




public class LetterPrinter {
    public static Letterhead askForLetterheadData(Scanner input){
        String name;
        String boundaryLine;
        char boundaryChar;

        System.out.println("Enter business name:");
        name = input.nextLine();

        System.out.println("Enter boundary character:");
        boundaryLine = input.nextLine();
        boundaryChar = boundaryLine.charAt(0);

        String [] sloganLines = new String[4];

        System.out.println("Enter slogan (max 4 lines):");
        for(int i = 0; i < 4; i++){
            sloganLines[i] = input.nextLine();
        }

        Letterhead l = new Letterhead(name, sloganLines, boundaryChar);

        return l;

    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Letterhead header;

        header = askForLetterheadData(input);

        System.out.println("Your new letterhead:");

        System.out.println(header);

    }

}
