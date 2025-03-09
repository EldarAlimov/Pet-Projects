import processing.core.*;

import java.util.Random;

public class Problem04 extends PApplet {
    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        Random rnd = new Random();
        for (int i = 0; i < 50; i++) {
            fill(rnd.nextInt(0, 255), rnd.nextInt(0, 255), rnd.nextInt(0, 255));
            circle(rnd.nextInt(0, width), rnd.nextInt(0, height), rnd.nextInt(10, 40));
        }

    }

    public void draw() {


    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}