import processing.core.*;

import java.util.Random;

public class Problem05 extends PApplet {
    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        for (int i = 0; i < 80; i++) {
            fill (i*5,0,0);
             circle(width/2, height/2, 800- i*10);
        }

    }

    public void draw() {


    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}