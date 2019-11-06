package com.base.siwy;

public class MainComponent {
    public static final int WIDTH = 1920;
    public static final int HEIGHT = 1080;
    public static final String TITLE = "3D Engine by Siwy";

    public MainComponent(){

    }

    public void start(){
        run();
    }

    public void stop(){

    }

    public void run(){
        while(!Window.isCloseRequested()){
            render();
        }
    }

    public void render(){
        Window.render();
    }

    public void cleanUp(){

    }

    public static void main(String[] args) {
        Window.createWindow(WIDTH, HEIGHT, TITLE);

        MainComponent game = new MainComponent();

        game.start();
    }
}
