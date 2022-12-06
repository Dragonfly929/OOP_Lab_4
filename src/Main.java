public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome!");
//        for (;;){
            for (geometryObject object : geometryObject.values()) {
                System.out.print("\n=========================================");
                int i = 0;
                while (i < object.toString().length()) {
                    System.out.print("=");
                    i++;
                }
                System.out.println();
                System.out.println("Design and drafting software Simulation: " + object);
                System.out.print("=========================================");
                int j = 0;
                while (j < object.toString().length()) {
                    System.out.print("=");
                    j++;
                }
                System.out.println("\nPosition Point: " + object.getPointPosition());

                switch (object) {
                    case POINT:
                        Point.displayPoint(10,20);
                        break;
                    case LINE:
                        Line l = new Line(0,1,0,10);
                        l.display(geometryObject.LINE);
                        break;
                    case POLYGON:
                        Polygon p = new Polygon();
                        p.display(geometryObject.POLYGON);
                        break;
                    case TRIANGLE:
                        TriangleSides tsides = new TriangleSides(9,9,3,3,3);
                        tsides.display(geometryObject.TRIANGLE);
                        System.out.println();
                        TriangleCoordinates tcoord = new TriangleCoordinates(0,0,0,4,3,0);
                        tcoord.display(geometryObject.TRIANGLE);
                        break;
                    case RECTANGLE:
                        Rectangle rect = new Rectangle(9,3);
                        Rectangle sq = new Rectangle(4,4);
                        rect.display(geometryObject.RECTANGLE);
                        System.out.println();
                        sq.display(geometryObject.RECTANGLE);
                        break;
                    case CIRCLE:
                        Circle circle = new Circle(4);
                        circle.display(geometryObject.CIRCLE);
                        break;
                    case ELLIPSE:
                        Ellipse ellipse = new Ellipse(6,3);
                        ellipse.display(geometryObject.ELLIPSE);
                        break;
                    case SPHERE:
                        Sphere sphere = new Sphere(1,1,1,4);
                        sphere.display(geometryObject.SPHERE);
                        break;
                    case CYLINDER:
                        Cylinder cylinder = new Cylinder(5,9);
                        cylinder.display(geometryObject.CYLINDER);
                        break;
                }

//            }
        }
    }
}