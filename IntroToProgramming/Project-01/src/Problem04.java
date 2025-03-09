
import processing.core.*;

import java.awt.event.KeyEvent;
import java.util.Random;

public class Problem04 extends PApplet {
        int x, y, r, time, randx, randy, score, speed, pros;
    boolean up;
    boolean down;
    boolean left;
    boolean right;
    boolean space;

        public void settings() {
            fullScreen();
            size(1920, 1080);
        }

        public void setup() {
            x = width / 3;
            y = height / 5;
            r = 50;
            time = 0;
            score = -1;
            boolean up = false;
            boolean down = true;
            boolean left = false;
            boolean right = false;
            boolean space = true;
            speed = 5;
            pros = 30;

        }

        public void draw() {
            fill(0, pros);
            rect(0, 0, width, height);
            fill(255, 0, 0);
            circle(x, y, r);
            int count = 0;
            int x1 = (width / 3)-25;
            int y1 = (height / 5)-25;
            int x2 = (width / 3)-25;
            int y2 = (height / 5)-25;
            do{
                stroke(21,17,145);
                line(x1,y1,x1+550,y1);
                y1+=50;
                count++;
            }while(count < 12);
            int count1 = 0;
            do{
                stroke(21,17,145);
                line(x2,y2,x2,y2+550);
                x2+=50;
                count1++;
            }while(count1 < 12);
            if (key == CODED) {
                if(keyPressed) {
                    if (keyCode == KeyEvent.VK_UP) {
                        up = true;
                        down = false;
                        left = false;
                        right = false;
                    }
                    if (keyCode == KeyEvent.VK_DOWN) {
                        up = false;
                        down = true;
                        left = false;
                        right = false;
                    }
                    if (keyCode == KeyEvent.VK_LEFT) {
                        up = false;
                        down = false;
                        left = true;
                        right = false;
                    }
                    if (keyCode == KeyEvent.VK_RIGHT) {
                        up = false;
                        down = false;
                        left = false;
                        right = true;
                    }
                }
                if(time % speed == 0) {
                    if (left && x > x1+50)
                        x = x - 50;
                    if (right && x < x1+500)
                        x = x + 50;
                    if (up && y > y2+50)
                        y = y - 50;
                    if (down && y < y2+500)
                        y = y + 50;
                }
            }
            if(space){
            Random rand = new Random();
             randx = rand.nextInt(0,11);
             randy = rand.nextInt(0,11);

            space = false;
            }
            if(x==x1+25+randx*50 && y==y2+25+randy*50){
                space = true;
                score++;
            }
            fill(255,255,255);
            circle(x1+25+randx*50,y2+25+randy*50,50);
            textSize(60);
            fill(255,255,255);
            text("Score: "+score,x1+200,y1);
            time++;
        }





        public static void main(String[] args) {
            PApplet.main("Problem04");
        }
    }
