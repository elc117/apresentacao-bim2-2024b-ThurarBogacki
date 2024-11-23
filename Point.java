public class Point{
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int manhattamDistanceFromOrigin(){
        return Math.abs(x) + Math.abs(y);
    }
    protected String location(){
        return x + ", " + y;
    }

    @Override
    public String toString(){
        return "(" + this.location() + ")" + this.manhattamDistanceFromOrigin();
    }
}