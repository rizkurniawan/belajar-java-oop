public class ShapeApp {
    public static void main(String[] args) {
        var shapeObj = new Shape();
        System.out.println(shapeObj.getCorner());

        var rectangleObj = new Rectangle();
        System.out.println(rectangleObj.getCorner());
        System.out.println(rectangleObj.getParentCorner());
    }
}
