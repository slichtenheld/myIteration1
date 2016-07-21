package com.sgl.Model;

/**
 * Created by slichtenheld on 7/19/2016.
 */
public class MoveableEntity extends Entity{

    public MoveableEntity(int x, int y, String name){
        super(x,y,name);
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    //implement with stats later
    public void moveNorth(){
        y--; // java swing (0,0) starts in upper right corner
    }

    public void moveSouth(){
        y++;
    }

    public void moveWest(){
        x--;
    }

    public void moveEast(){
        x++;
    }

}
