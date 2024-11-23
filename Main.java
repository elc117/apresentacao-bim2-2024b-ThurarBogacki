import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(4,8));
        points.add(new ColorPoint(1,1, "green"));
        points.add(new ColorPoint(2,5,"Red"));
        points.add(new Point(0,0));
        points.add(new Point3D(2,5,1));
        points.add(new Point3D(3, 1, 3));

        for(Point p : points){
            System.out.println(p);
        }
        System.out.println(Math.abs(-5));
    }
}