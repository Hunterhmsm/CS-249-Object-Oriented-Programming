package edu.mcgiveh.exercises02;

public class Wasteland {
    public static void main(String [] args){
        //Type of thing / name / = / new / type of thing
        NPC bob = new NPC("Bobby", 96);
        NPC joe = new NPC("Joseph", 56);

        //Only affects data in the objects, not the class
        bob.setName("Bob");
        joe.setName("Joe");
        bob.setHealth(100);
        joe.setHealth(75);


        System.out.println(bob.getName() + ", " + bob.getHealth());
        System.out.println(joe.getName() + ", " + joe.getHealth());

        NPC [] town = new NPC[3];
        town[0] = new NPC();
        town[1] = new NPC();
        town[2] = new NPC();


    }
}
