import java.awt.*;

class Circle extends Shape{
    private int r;

    Circle(int x, int y, int r){

        super(x, y);
        this.color = Color.BLUE;
        this.r = r;
    }
    public int getR(){
        return r;
    }
    public void setR(int r){
        if(r <= 0){
            throw new IllegalArgumentException("Radius should be a positive number");
        }
        this.r = r;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }


    @Override
    public boolean contains(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        double dist = Math.sqrt(dx * dx + dy * dy);
        return dist < r;
    }
    @Override
    public String toString() {
        return String.format("Circle: %d, %d, %d", x, y, r);
    }


}