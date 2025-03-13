package at.fhj.msd;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Point point1 = new Point(3, 4);
        Point point2 = new Point(4, 5);
        //Point point3 = new Point(3, 6);

        System.out.println(point2.distanceMax(point1));
        System.out.println(point2.distanceNorm1(point1));
        System.out.println(point1.distanceNorm2(point2));
        System.out.println(point1.distancefromzero());
    }
}
