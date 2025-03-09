import processing.core.*;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

import static java.awt.event.KeyEvent.VK_MINUS;
import static java.awt.event.KeyEvent.VK_PLUS;
public class Problem07 extends PApplet {
    float angleh, anglem, angles;
    public void settings() {
        fullScreen();
        size(1920, 1080);
    }
    PShape s;
    PShape s1;
    PShape s2;
    float leng;
    float leng1;
    float leng2;
    public void setup() {
        angleh = 0;
        anglem = 0;
        angles = 0;
        leng = 200;
        leng1 = 220;
        leng2 = 240;
        s = createShape();
        s.beginShape();
        s.fill(0,0,255);
        s.noStroke();
        s.vertex(0, 0);
        s.vertex(0, -0.8f*leng);
        s.vertex(-10, -0.7f*leng);
        s.vertex(2.5f, -1*leng);
        s.vertex(15, -0.7f*leng);
        s.vertex(5, -0.8f*leng);
        s.vertex(5, 0);
        s.endShape(CLOSE);

        s1 = createShape();

        s1.beginShape();
        s1.fill(255,255,0);
        s1.noStroke();
        s1.vertex(0, 0);
        s1.vertex(0, -0.8f*leng1);
        s1.vertex(-10, -0.7f*leng1);
        s1.vertex(2.5f, -1*leng1);
        s1.vertex(15, -0.7f*leng1);
        s1.vertex(5, -0.8f*leng1);
        s1.vertex(5, 0);
        s1.endShape(CLOSE);

        s2 = createShape();

        s2.beginShape();
        s2.fill(0,255,255);
        s2.noStroke();
        s2.vertex(0, 0);
        s2.vertex(0, -0.8f*leng2);
        s2.vertex(-10, -0.7f*leng2);
        s2.vertex(2.5f, -1*leng2);
        s2.vertex(15, -0.7f*leng2);
        s2.vertex(5, -0.8f*leng2);
        s2.vertex(5, 0);
        s2.endShape(CLOSE);
    }

    public void draw() {
        background(0, 0, 0);
        fill(255);
        int h = LocalDateTime.now().getHour();
        int m = LocalDateTime.now().getMinute();
        int sec = LocalDateTime.now().getSecond();
        LocalTime now = LocalTime.now();
        textSize(25);
        text( now.format(DateTimeFormatter. ofPattern("HH:MM:SS")), width/2-50, 100);
        drawArrow(width/2, height/2, 2*PI*h/60f, 1);
        drawArrow(width/2, height/2, 2*PI*m/60f, 2);
        drawArrow(width/2, height/2, 2*PI*sec/60f, 3);
        drawClock();
    }

    public static void main(String[] args) {
        PApplet.main("Problem07");
    }
    public void drawArrow(float xc,float yc, float angle,int cnt){
        pushMatrix();
        translate(width/2,height/2);
        rotate(angle);
        if(cnt==1)
            shape(s,0,0);
        if(cnt==2)
            shape(s1,0,0);
        if(cnt==3)
            shape(s2,0,0);
        popMatrix();
    }
    public void drawClock(){
        circle(width/2,height/2,4);
        strokeWeight(5);
        for(int i =0;i<60;i++){
            float a = PI*i/30f;
            float x = 300*cos(a);
            float y = 300*sin(a);
            float lx = 10*cos(a);
            float ly =10*sin(a);
            float stx = 20*cos(a);
            float sty = 20*sin(a);
            stroke(255, 255,255);
            if(i%5==0)
                line(width/2+x,height/2+y,width/2+x+stx,height/2+y+sty);
            else
                line(width/2+x,height/2+y,width/2+x+lx,height/2+y+ly);

        }
    }

}