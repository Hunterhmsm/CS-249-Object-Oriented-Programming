package edu.mcgiveh.assign05;

public class Troll extends Giant {


    public Troll(String name) {
        super(name);
    }
    @Override
    public String toString(){
        String s = "Troll " + super.toString();
        return s;
    }

    public String cook(){
        return "Mutton again...";
    }


}
