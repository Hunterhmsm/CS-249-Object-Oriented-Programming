package edu.mcgiveh.assign07;

import edu.mcgiveh.assign06.Creature;

import static java.lang.Math.abs;

public class AvoidPlayer implements MoveAlgorithm {

    @Override
    public void move(Creature current, Player p){
        int rowDist = p.getRow() - current.getRow();
        int colDist =  p.getCol() - current.getCol();

        if((rowDist != 0) || (colDist != 0)){
            if(abs(rowDist) > abs(colDist)){
                if(rowDist < 0){
                    current.setRow(current.getRow() + 1);
                }
                else{
                    current.setRow(current.getRow() - 1);
                }
            }
            else{
                if(colDist < 0){
                    current.setCol(current.getCol() + 1);
                }
                else{
                    current.setCol(current.getCol() - 1);
                }
            }
        }
    }
}
