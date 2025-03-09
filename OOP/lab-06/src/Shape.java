import java.awt.*;

public abstract class Shape{
    protected int x;
    protected int y;
    Color color;
    Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
    protected int getX(){
        return x;
    }
    protected void setX(int x){
        this.x = x;
    }
    protected int getY(){
        return y;
    }
    protected void setY(int y){
        this.y = y;
    }
    protected abstract boolean contains(int a, int b);
}
