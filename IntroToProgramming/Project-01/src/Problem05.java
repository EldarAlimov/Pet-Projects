import processing.core.*;

import javax.security.auth.kerberos.KeyTab;

public class Problem05 extends PApplet {

    public void settings() {
        fullScreen();
        size(1920, 1080);
    }
    int sz, x, y, s, tic;
    public void setup() {
        s = 50;
        sz = 5;
        tic = 0;
    }

    public void draw() {
        background(0, 100, 0);
        if(keyPressed && keyCode== UP && sz<14 && tic%8==0) sz++;
        if(keyPressed && keyCode== DOWN && sz>4 && tic%8==0) sz--;

        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                if((i+j)%2==0)fill(255);
                else fill(0);
                x = width/2 - s*sz/2;
                y = height/2 - s*sz/2;
                square(x+i*s, y+j*s, s);
            }
        }
        if(mouseX >= x & mouseX <= x+s & mouseY >= y & mouseY <= y +s){
            int xnum = (mouseX-x)/(s/sz);
            int ynum = (mouseY-y)/(s/sz);
            fill(255,255,255);
            textSize(20);
            text("Row: ",700,50);
            text(ynum,750,50);
            text("; Column: ",765,50);
            text(xnum,860,50);
            String ans = "White";
            if((xnum+ynum)%2==1){
                ans = "Black";
            }
            text("; Color: "+ans,900,50);

            float bgx = x+xnum*(s/sz)+2;
            float bgy = y+ynum*(s/sz)+2;
            float lt = s/sz-4;
            stroke(255,0,0);
            strokeWeight(4);
            line(bgx,bgy,bgx,bgy+lt);

            line(bgx+lt,bgy,bgx+lt,bgy+lt);

            line(bgx,bgy,bgx+lt,bgy);

            line(bgx+lt,bgy+lt,bgx,bgy+lt);
            stroke(0,0,0);

        }
        fill(255,255,255);
        textSize(20);
        text("Size ",600,850);
        text(sz,650,850);
        text(": use +/- to change size in [4..12]",680,850);
        tic++;
        if(tic > 100000) tic = 0;
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}