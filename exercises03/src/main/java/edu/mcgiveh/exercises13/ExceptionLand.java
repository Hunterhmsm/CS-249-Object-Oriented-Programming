package edu.mcgiveh.exercises13;

import java.io.*;
import java.util.*;
public class ExceptionLand {


    public static void addNumbers() {
        Scanner input = new Scanner(System.in);
        try {
            int x = input.nextInt();
            int y = input.nextInt();
            int result = x + y;
            System.out.print(result);
            String s = null;
            System.out.println("Length " + s.length());
        } catch (InputMismatchException m) {
            System.err.println("Wrong kind of input!");
        }
        catch(ArithmeticException m) {
            System.err.println("Bad math");
        }
        catch(Exception e){
            System.err.println("Something went awry!");
        }
    }
    public static void loadFile(String filename) {
        try {
            throw new IOException("I don't know file ID");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

        public static void main (String [] args){
            loadFile("myfile.txt");
            addNumbers();

        }
}
