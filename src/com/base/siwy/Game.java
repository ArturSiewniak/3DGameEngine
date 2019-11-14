package com.base.siwy;

import org.lwjgl.input.Keyboard;

public class Game {
    public Game(){

    }

    public void input(){
        if (Input.GetKeyDown(Keyboard.KEY_UP)){
            System.out.println("We've pressed up!");
        }
        if (Input.GetKeyUp(Keyboard.KEY_UP)){
            System.out.println("We've released up!");
        }

        if (Input.GetMouseDown(1)){
            System.out.println("We've pressed rmb at " + Input.GetMousePosition().toString() + "!");
        }
        if (Input.GetMouseUp(1)){
            System.out.println("We've released rmb at " + Input.GetMousePosition().toString() + "!");
        }
    }

    public void update(){

    }

    public void render(){

    }

}
