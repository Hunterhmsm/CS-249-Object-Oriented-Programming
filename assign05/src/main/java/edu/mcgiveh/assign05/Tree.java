package edu.mcgiveh.assign05;

public class Tree extends  Giant{


    public Tree(String name) {
        super(name);
    }
@Override
    public String toString(){
        String s = super.toString() + " of the trees";
        return s;
    }

    public String speak(){
        return "<rustling>";
    }
}
