package edu.mcgiveh.exercises02;

public class NPC {
    //Not going to be a runable class

    //Instance data - another name for an object
    //Private sets so that no other object can modify name or value
    private String name = "";
    private int health = 100;


    public NPC(){
        //Does nothing
    }

    public NPC(String n){
        //Must use a name but defaults to 100 health
        name = n;
    }
    //Most constuctors will be public and the name of the class, will be exceptions in the future.
    public NPC(String n, int h){
        name = n;
        setHealth(h);
    }
    //If you dont put static, it is instance data
    //Static functions cant access instance data, static goes with static

    //Getter functions, allows other objects to get private data values while still keeping them private
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }



    //Setter functions, allows other objects to change private data values while still keeping them private
    public void setName(String n){

        name = n;
    }
    public void setHealth(int h){

        health = h;
        if(health <= 0){
            health = 0;
        }
    }

    public void takeDamage(int d) {
        int healthAfter = health - d;
        setHealth(healthAfter);
        }
    }
