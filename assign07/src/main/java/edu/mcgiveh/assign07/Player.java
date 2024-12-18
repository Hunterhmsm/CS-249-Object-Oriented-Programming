package edu.mcgiveh.assign07;

import edu.mcgiveh.assign06.Creature;

import edu.mcgiveh.assign04.CharBoard;

public class Player extends Creature {
    public Player(){
    }

    public Player(int row, int col){
        super(row, col);
    }

    public String toString(){
        return "Player at " + getRow() + "," + getCol();
    }
    @Override
    public void draw(CharBoard map){
        map.setPos(getRow(), getCol(), 'P');
    }
}
