import processing.core.*;

public class Problem02 extends PApplet {

    public void settings() {
        fullScreen();
        size(1920, 1080);
    }
    boolean txt1, txt2, txt3, t1, t2, t3;
    int s1, s2, s3, m, M;
    public void setup() {
        m = 70;
        M = 150;
        txt1 = true;
        txt2 = false;
        txt3 = false;
        t1 = false;
        t2 = false;
        t3 = false;
        s1 = s2 = s3 = m;

    }

    public void draw() {
        background(0, 0, 0);
        textSize(s1);
        fill (0, 0, 255);
        text("Java Slogan:", width/8*3, 250 );
        if(!txt2 && !txt3 && !t3 && !t2){
            if(txt1)s1++;
            if(t1)s1--;
            if(s1>M){
                txt1 = false;
                t1 = true;
            }
            if(s1 < m){
                t1 = false;
                txt2 = true;
            }
        }

        textSize(s2);
        fill (0, 255, 0);
        text("Write ones", width/8*3, 500);
        if(!txt1 && !txt3 && !t3 && !t1){
            if(txt2)s2++;
            if(t2)s2--;
            if(s2>M){
                txt2 = false;
                t2 = true;
            }
            if(s2 < m){
                t2 = false;
                txt3 = true;
            }

        }

        textSize(s3);
        fill (255, 0, 0);
        text("run anywhere!", width/8*3, 750);
        if(!txt2 && !txt1 && !t1 && !t2){
            if(txt3)s3++;
            if(t3)s3--;
            if(s3>M){
                txt3 = false;
                t3 = true;
            }
            if(s3 < m){
                t3 = false;
                txt1 = true;
            }

        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}