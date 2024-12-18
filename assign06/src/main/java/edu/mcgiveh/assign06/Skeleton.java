package edu.mcgiveh.assign06;

import edu.mcgiveh.assign04.CharBoard;

public class Skeleton extends Creature {

    public Skeleton(){}

    public Skeleton(int row, int col){
        super(row, col);
    }

    public String toString(){
        return "Skeleton at " + getRow() + "," + getCol();
    }

    @Override
    public void draw(CharBoard map) {
        map.setPos(getRow(), getCol(), 'S');
    }
}

