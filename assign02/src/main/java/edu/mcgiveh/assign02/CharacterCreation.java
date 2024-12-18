package edu.mcgiveh.assign02;

import java.util.*;

public class CharacterCreation {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Player p = new Player();

        String first = "";
        String last = "";
        int height = 0;
        double weight = 0;

        System.out.println("Enter name:");
        first = input.next();
        last = input.next();

        System.out.println("Enter height in inches:");
        height = input.nextInt();

        System.out.println("Enter weight in pounds:");
        weight = input.nextDouble();

        p.setFirstName(first);
        p.setLastName(last);
        p.setHeight(height);
        p.setWeight(weight);

        System.out.println(p.toString());

    }
}
