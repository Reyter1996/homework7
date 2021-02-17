public class ShapePrint {
    public static void printShape(Shape shape){
        String result = "This is " + shape.getName() + ((shape instanceof ThreeDShapes)? " and this is 3D-shape":
                (shape instanceof TwoDShapes)?" and this is 2D-shape":"");
        System.out.println(result); }
public ShapePrint(){
    }
}