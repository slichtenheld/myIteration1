package com.sgl.Controller.Actions.MovementActions;

import com.sgl.Controller.Command;
import com.sgl.Model.MoveableEntity;

/**
 * Created by slichtenheld on 7/20/2016.
 */
public abstract class MoveCommand implements Command {
ss
    MoveableEntity entity;

    public MoveCommand(MoveableEntity entity){
        this.entity = entity;
    }

    @Override
    public void execute() {}
}

