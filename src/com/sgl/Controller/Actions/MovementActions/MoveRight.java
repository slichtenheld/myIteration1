package com.sgl.Controller.Actions.MovementActions;

import com.sgl.Controller.Command;
import com.sgl.Model.MoveableEntity;

/**
 * Created by slichtenheld on 7/19/2016.
 */
public class MoveRight extends MoveCommand {

    public MoveRight(MoveableEntity entity) {
        super(entity);
    }

    @Override
    public void execute() {
        entity.moveEast();
    }
}
