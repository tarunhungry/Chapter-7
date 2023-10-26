// in this we will create a super class in which we use extend to knwo about the inheritence property of OOPs

class TwoDShape{
    double width, height;

    TwoDShape(){

    }
    TwoDShape(double _width, double _height){
        width=_width;
        height=_height;
    }
    void showDim(){
        System.out.println(" Width : "+ this.width+" AND Height : "+ this.height);
    }
}
// try to make subclass with the help of extends
class Triangle extends TwoDShape{
    String style;
    // this is construcor
    Triangle(){

    }
    Triangle(double _width, double _height) {
        super(_width, _height);
        style = "Not given";
    }
    Triangle(double _width, double _height, String _style) {
        super(_width, _height);
        style = _style;
    }

    double area(){
        return this.height*this.width;
    }
    void showStyle(){
        System.out.println("Triangle is "+ style);
    }
    void printData(){
        this.showDim();
        System.out.println("Style : "+style);
    }
}
public class Shapes {


    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(10,45);
        Triangle t3 = new Triangle(10,45, "solid");
        t1.width = 23;
        t1.height = 85;
        t1.style = "dotted";

        // lets print the data
        t1.printData();
        t2.printData();
        t3.printData();

    }
}