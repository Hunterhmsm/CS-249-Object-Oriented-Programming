package edu.mcgiveh.assign05;

public class Huorn extends Tree{


    public Huorn(String name) {
        super(name);
    }
@Override
    public String toString(){
        return "Huorn " + super.toString();
    }
@Override
    public String speak(){
        return "<angry rustling>";
    }
}
