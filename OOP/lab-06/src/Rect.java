class Rect extends Shape{
    private int w;
    private int h;


    public Rect(int x, int y, int w, int h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }

    public int getW(){
        return this.w;
    }
    public void setW(int w){
        this.w = w;
    }
    public int getH(){
        return this.h;
    }
    public void setH(int h){
        this.h = h;
    }

    @Override
    public boolean contains(int x, int y) {
        return x >= this.x && x < this.x + w &&
                y >= this.y && y < this.y + h;
    }
    @Override
    public String toString() {
        return String.format("Rect: %d, %d, %d, %d", x, y, w, h);
    }

}