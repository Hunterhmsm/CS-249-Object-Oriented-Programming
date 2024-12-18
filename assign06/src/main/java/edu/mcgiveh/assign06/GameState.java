package edu.mcgiveh.assign06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import edu.mcgiveh.assign04.CharBoard;


public class GameState implements Loadable {


    private ArrayList<Loadable> Loadables = new ArrayList<>();
    private CharBoard map = new CharBoard(12, 30, '.');

    public Loadable createLoadable(String typename) throws GameFileException {
        if (typename.equals("Skeleton")) {
            return new Skeleton();
        }
        if (typename.equals("Rat")) {
            return new Rat();
        }
        if (typename.equals("Item")) {
            return new Item();
        }
        if (typename.equals("Book")) {
            return new Book();
        }
        throw new GameFileException("Unknown type: " + typename);
    }


    @Override
    public void load(Scanner input) throws GameFileException {

        int lines = 0;

        map.clear();
        Loadables.clear();
        lines = input.nextInt();
        while(input.hasNextLine()){

            String typeName = input.next();
            Loadable m = createLoadable(typeName);
            m.load(input);
            Loadables.add(m);
            if (m instanceof Creature) {
                ((Creature) m).draw(map);
            }
            lines++;
            input.nextLine();
        }

        input.close();
    }



    public String toString(){
        String s = "MAP:\n";
        s += map.getMapString() + "\n";
        s += "CREATURES:\n";
        for(int i = 0; i < Loadables.size(); i++){
            if(Loadables.get(i) instanceof Creature){
                s += "* " + ((Creature)Loadables.get(i)).toString() + "\n";
            }
        }
        s += "INVENTORY:\n";
        for(int i = 0; i < Loadables.size(); i++){
            if(Loadables.get(i) instanceof Item){
                s += "* " + ((Item)Loadables.get(i)).toString() + "\n";
            }
        }
        return s;
    }

    public void save(String filename) throws GameFileException{
        try{
            PrintWriter w = new PrintWriter(filename);
            w.print(this.toString());
            w.close();
        } catch (Exception e){
            throw new GameFileException("Failed to save file!", e);
        }
    }
}

