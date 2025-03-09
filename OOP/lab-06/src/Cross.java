class Cross extends Shape{
    private int w;
    private int h;
    private Rect verticalRect;
    private Rect horizontalRect;
    Cross(int x, int y, int w, int h){
        super(x, y);
        this.w = w;
        this.h = h;
        verticalRect = new Rect(x-(w/2), y-(h/2), w, h);
        horizontalRect = new Rect (x-(h/2), y - (w/2), h, w);
    }

    @Override
    public boolean contains(int a, int b) {
        return verticalRect.contains(a, b) || horizontalRect.contains(a, b);
    }

    @Override
    public String toString() {
        return String.format("Cross: (" + verticalRect.toString() + "), (" + horizontalRect.toString() + ")" );
    }
}
