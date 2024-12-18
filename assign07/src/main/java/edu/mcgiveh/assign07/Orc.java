package edu.mcgiveh.assign07;

import edu.mcgiveh.assign04.CharBoard;
import edu.mcgiveh.assign06.Creature;

public class Orc extends Creature implements Mover {

    private SeekPlayer movement = new SeekPlayer();
    public Orc(){}

    public Orc(int row, int col){
        super(row, col);
    }

    public String toString(){
        return "Orc at " + getRow() + "," + getCol();
    }

    @Override
    public void draw(CharBoard map){
        map.setPos(getRow(), getCol(), 'O');
    }
    @Override
    public void performMove(Player p){
        movement.move(this, p);
    }
}
