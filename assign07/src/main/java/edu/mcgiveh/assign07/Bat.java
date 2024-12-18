package edu.mcgiveh.assign07;

import edu.mcgiveh.assign04.CharBoard;
import edu.mcgiveh.assign06.Creature;

public class Bat extends Creature implements Mover {

    private AvoidPlayer movement = new AvoidPlayer();
    public Bat(){}

    public Bat(int row, int col){
        super(row, col);
    }

    public String toString(){
        return "Bat at " + getRow() + "," + getCol();
    }

    @Override
    public void draw(CharBoard map){
        map.setPos(getRow(), getCol(), 'B');
    }
    @Override
    public void performMove(Player p){
        movement.move(this, p);
    }
}
