import processing.core.*;

public class Problem06 extends PApplet {

    float dangle, angle, x, y;
    public void settings() {
        fullScreen();
        size(1920, 1080);
    }
    float angle1, angle2, angle3, rads, r1, r2, r3, xs, ys, x1, y1, x2, y2, x3, y3;
    public void setup() {
        angle1=0;
        angle2=0;
        angle3=0;

        xs = width/2;
        ys = height/2;
        y1 = 0;
        x1 = 300;
        y2 = 0;
        x2 = 200;
        x3 = 0;
        y3 = 25;
        rads = 250;
        r1=50;
        r2=75;
        r3=25;
    }

    public void draw() {
        background(0, 0, 0);
        angle1+=0.01f;
        angle2+=0.02f;
        angle3+=0.03f;
        Sun(xs, ys, rads, 255, 255, 0);
        rotate(x1,y1, r1, xs, ys, angle1, 0, 0, 255);
        rotate(x2, y2, r2, xs, ys, angle2, 255, 50, 50);
        rotate(x3, y3, r3, width/2+cos(angle1)*x1, height/2+sin(angle1)*x1, angle3, 200, 200, 255);
    }
    public void Sun(float x,float y,float rad,float r,float g,float b){
        for(int i = (int)rad;i>=0;i-=5){
            float alpha  = (1.0f-i/rad)*255;
            fill(r,g,b,alpha);
            strokeWeight(0);
            circle(x,y,i);
        }
        strokeWeight(1);
    }
    public void rotate(float x,float y,float rad,float xc,float yc, float angle,float r,float g,float b){
        pushMatrix();
        translate(xc,yc);
        rotate(angle);
        translate(0,0);
        Sun(x,y,rad,r,g,b);
        popMatrix();

    }


    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}
