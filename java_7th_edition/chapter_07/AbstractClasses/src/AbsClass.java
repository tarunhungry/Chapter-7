// Create am abstract class
abstract class TwoDShape{
    private double width;
    private double height;
    private String name;

    // default constructor
    TwoDShape(){
        width = height =0.0;
        name = "none";
    }
    TwoDShape(double _width, double _height){
        width = _width;
        height = _height;
    }
    // paramaterised constructor
    TwoDShape(double _width, double _height, String _name){
        width = _width;
        height = _height;
        name = _name;
    }
    // constructor with same width and height
    TwoDShape(double _sameLength, String _name){
        width = height = _sameLength;
        name = _name;
    }
    // Construct and object from an object
    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    // Accessor methods for width and height
    double getWidth(){ return width;}
    double getHeight(){ return height;}
    void setWidth(double _width){ width = _width;}
    void setHeight(double _height){ height = _height;}
    String getName(){return name;}

    void showDim(){
        System.out.println("Width and Height are "+width+" and "+ height);

    }
    // Now area() which will be abstract
    abstract double area();
    abstract String getStyle();

}
// A subclass of TwoDShape for Triangle
class Triangle extends TwoDShape{
    private String style;
    // default constructor
    Triangle(){
        super();
        style = "none";
    }
    // constructor for Triangle
    Triangle(double _width, double _height, String _style){
        super(_width, _height);
        style = _style;
    }
    // one Argument constructor
    Triangle(double length){
        super(length, "Triangle");
        style = "Filled";
    }
    Triangle(Triangle ob){
        super(ob);
        style = ob.style;
    }
    double area(){
        return (getWidth()*getHeight())/2;
    }
    void showStyle(){
        System.out.println("Triangle is "+ style);
    }
    String getStyle(){
        return style;
    }
}

// a subclass for Rectangle
class Rectangle extends TwoDShape{
    private String style;

    Rectangle(){
        super();
        style = "none";
    }
    Rectangle(double _width, double _length){
        super(_width, _length);
        style = "Dotted";
    }
    Rectangle(double _width, double _height, String _style){
        super(_width,_height, "Rectangle");
        style = _style;
    }
    // constructor for square
    Rectangle(double length){
        super(length, "Square");

    }
    String getStyle(){
        return style;
    }

    @Override
    double area() {
        return getWidth()*getHeight();
    }
}

public class AbsClass{
    public static void main(String[] args) {
        TwoDShape[] shapes = new TwoDShape[3];

        shapes[0] = new Triangle(8.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10.0, 44, "dotted");
        for (int i=0; i< shapes.length;i++){
            System.out.println("Object is " + shapes[i].getName());
            System.out.println("Area is "+ shapes[i].area());
            System.out.println("Style is "+ shapes[i].getStyle());
            System.out.println();
        }
    }
}