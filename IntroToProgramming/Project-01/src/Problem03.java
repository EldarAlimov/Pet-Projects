import processing.core.*;

public class Problem03 extends PApplet {

    int t;

    public void settings() {
        fullScreen();
        size(1920, 1080);

    }

    public void setup() {
        t = 2;
        textSize(128);
    }

    public void draw() {
        background(0, 0, 0);
        fill (0, 200, 0);
        circle(320 , 270, 300);

        if (mouseX >= 510 & mouseX <= 1010 & mouseY >= 120 & mouseY <= 420){
            fill (255, 255, 0);
            rect (510 - t, 120 - t, 500 +2*t,300 + 2*t);
            text("rectangle", 500, 760);
        }
        fill (200, 0, 0);
        rect (510, 120, 500, 300);
        fill (0, 200, 200 );
        circle (1220, 270, 300);
        fill (0,0,0);
        circle (1220, 270, 250);

    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}