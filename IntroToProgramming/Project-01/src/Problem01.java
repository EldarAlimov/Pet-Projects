import processing.core.*;

public class Problem01 extends PApplet {
    int x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, r, xd, yd, speed, tail;
    public void settings() {
        fullScreen();
        size(1920, 1080);
    }

    public void setup() {
        background(0, 0, 0);
        x1 = width/3;
        y1 = height/3;
        x2 = width/3*2;
        y2 = height/3;
        x3 = width/2;
        y3 = height/2;
        x4 = width/3;
        y4 = height/3*2;
        x5 = width/3*2;
        y5 = height/3*2;
        r = 50;
        speed = 10;
        xd = 1;
        yd = 1;
        tail = 50;
    }

    public void draw() {
        fill(0, tail);
        rect(0, 0, width, height);
        fill(255);
        circle(x1, y1,r);
        circle(x2, y2,r);
        circle(x3, y3,r);
        circle(x4, y4,r);
        circle(x5, y5,r);
        x1 = x1 + xd*speed;
        x2 = x2 + xd*speed;
        x3 = x3 + xd*speed;
        x4 = x4 + xd*speed;
        x5 = x5 + xd*speed;
        y1 = y1 + yd*speed;
        y2 = y2 + yd*speed;
        y3 = y3 + yd*speed;
        y4 = y4 + yd*speed;
        y5 = y5 + yd*speed;
        if (x1 <r || x1 >width-r || x2 <r || x2 >width-r || x3 <r || x3 >width-r || x4 <r || x4 >width-r || x5 <r || x5 >width-r ) xd = xd * -1;
        if (y1 <r || y1 >height-r || y2 <r || y2 >height-r || y3 <r || y3 >height-r || y4 <r || y4 >height-r || y5 <r || y5 >height-r ) yd = yd * -1;

    }

    public static void main(String[] args) {
        PApplet.main("Problem01");

    }

}