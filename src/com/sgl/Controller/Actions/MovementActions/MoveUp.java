package com.sgl.Controller.Actions.MovementActions;

import com.sgl.Controller.Command;
import com.sgl.Model.MoveableEntity;

/**
 * Created by slichtenheld on 7/19/2016.
 */
public class MoveUp extends MoveCommand {

    public MoveUp(MoveableEntity entity) {
        super(entity);
    }

    @Override
    public void execute() {
        entity.moveNorth();
    }
}
