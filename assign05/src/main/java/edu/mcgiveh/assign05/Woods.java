package edu.mcgiveh.assign05;

import java.util.ArrayList;

public class Woods {

private ArrayList<Giant> myGiants = new ArrayList<>();
    public Giant createGiant(String name, String typename){

            if(name.length() == 0){
                return null; }

            if(typename.equals("GIANT")){
                return new Giant(name);
            }
            if(typename.equals("TROLL")){
                return new Troll(name);
            }
            if(typename.equals("TREE")){
                return new Tree(name);
            }
            if(typename.equals("ENT")){
                return new Ent(name);
            }
            if(typename.equals("HUORN")){
                return new Huorn(name);
            }
           return null;

    }

    public boolean addGiant(String name, String typename){
        Giant g = createGiant(name, typename);

        if(g != null){
            myGiants.add(g);
            return true;
        }
        else{
            return false;
        }
    }

    public Giant getGiant(int index){
        if(index >= 0 && index < myGiants.size()){
            return myGiants.get(index);
        }
        else{
            return null;
        }
    }

    public void printAllGiants(){
        System.out.println("ALL GIANTS:");
        for(int i = 0; i<myGiants.size(); i++){
            System.out.println("- " + myGiants.get(i).toString());
        }
    }

    public void printAllTrees(){
        System.out.println("ALL TREES:");
        for(int i = 0; i<myGiants.size(); i++){
            if(myGiants.get(i) instanceof Tree){
                System.out.println("- " + myGiants.get(i).toString() + ": " + ((Tree) myGiants.get(i)).speak());
            }
        }
    }


    public void printAllTrolls(){
        System.out.println("ALL TROLLS:");
        for(int i = 0; i<myGiants.size(); i++){
            if(myGiants.get(i) instanceof Troll){
                System.out.println("- " + myGiants.get(i).toString() + ": " + ((Troll) myGiants.get(i)).cook());
            }
        }
    }
}
