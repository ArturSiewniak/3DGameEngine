package com.base.siwy;

import org.lwjgl.input.Keyboard;

public class Game {
    public Game(){

    }

    public void input(){
        if (Input.getKeyDown(Keyboard.KEY_UP)){
            System.out.println("We've pressed up!");
        }
        if (Input.getKeyUp(Keyboard.KEY_UP)){
            System.out.println("We've released up!");
        }

        if (Input.getMouseDown(1)){
            System.out.println("We've pressed rmb at " + Input.getMousePosition().toString() + "!");
        }
        if (Input.getMouseUp(1)){
            System.out.println("We've released rmb at " + Input.getMousePosition().toString() + "!");
        }
    }

    public void update(){

    }

    public void render(){

    }

}
