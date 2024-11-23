public class Point3D extends Point{
    private final int z;

    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    @Override
    protected String location(){
        return super.location() + ", " + z;
    }
    @Override
    public int manhattamDistanceFromOrigin(){
        return super.manhattamDistanceFromOrigin() + Math.abs(z);
    }
    @Override
    public String toString(){
        return "(" + this.location() + ")" + this.manhattamDistanceFromOrigin();
    }
}
