package com.sgl.Main;

import com.sgl.View.AreaViewPort;
import com.sgl.Main.Threads.Engine;

/**
 * Created by sgl on 4/24/16.
 */
public class main {

    public static void main(String[] args) {

        //ViewManager viewManager = new ViewManager();

        //create JPanel first. Add to window. Start Thread.

        AreaViewPort areaViewPort = new AreaViewPort();

        Window window= new Window(1920,1080,"Test",areaViewPort);

        Engine modelEngine = new Engine("model",60);

        modelEngine.addTickable(areaViewPort);
        modelEngine.start();
        //modelEngine.addTickable(new SquareTest("TWO: "));

    }

}
