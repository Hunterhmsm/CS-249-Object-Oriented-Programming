package edu.mcgiveh.exercises12;
import edu.mcgiveh.math.Point2D;
import java.util.*;


public class ShapeLand {
    public static void main(String [] args) {

        Circle c = new Circle();
        Point2D p = c.getCenter();

        Circle c2 = new Circle(8.9, new Point2D(2,3));

        System.out.println(c2);

        Shape s = new Circle();
        System.out.println("BEFORE: " + s);
        s = new Shape();
        System.out.println("AFTER: " + s);

        Shape [] allShapes = new Shape[5];
        for(int i = 0; i < allShapes.length; i++) {
            if(i%2 == 0) {
                allShapes[i] = new Shape();
            }
            else {
                allShapes[i] = new Circle();
            }
        }

        System.out.println("ALL SHAPES:");
        for(Shape myShape: allShapes) {
            System.out.println(myShape);
        }

        double radius = -1.0;
        Scanner input = new Scanner(System.in);
        ArrayList<Circle> allCircles = new ArrayList<>();
        do{
            System.out.println("Enter radius (negative for stop)");
            radius = input.nextDouble();
            if(radius >= 0.0){
                Circle oneCircle = new Circle(radius);
                allCircles.add(oneCircle);
            }
        }while(radius >= 0.0);

        System.out.println("Number of circles: " + allCircles.size());

        if(allCircles.size() >= 3) {
            Circle aCircle = allCircles.get(2);
            aCircle.setRadius(100);
        }

        if(allCircles.size() >= 1){
            allCircles.set(0, new Circle(9001));
        }

        System.out.println("ALL CIRCLES:");
        for(Circle oneCircle: allCircles){
            System.out.println("* " + oneCircle.getRadius());
        }

        Circle anotherCircle = new Circle(9001);


        if(allCircles.size() >= 1){
            Circle oldOne = allCircles.remove(0);
            System.out.println("Removed:" + oldOne.getRadius() );
        }

        System.out.println("ALL CIRCLES AGAIN:");
        for(Circle oneCircle: allCircles){
            System.out.println("* " + oneCircle.getRadius());
        }

        allCircles.clear();
        System.out.println("Number of circles now: " + allCircles.size());
    }
}
