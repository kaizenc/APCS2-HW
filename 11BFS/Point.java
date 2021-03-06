public class Point{
    private int x,y,c;
    private Point prev;
    public Point(int x, int y, int c){
        this.x = x;
        this.y = y;
        prev = null;
        this.c = c;
    }
    public Point(int x, int y, int c,  Point prev){
        this.x = x;
        this.y = y;
        this.prev = prev;
        this.c = c;
    }
    public int getX(){
       return x;
    }
    public int getY(){
        return y;
    }
    public int getC(){
        return c;
    }
    public Point getPrev(){
        return prev;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}