// use a static varibale
// in this we will learn about the differnece between the instance variable and the static variables
class StaticDemo{
    int x; // a normal instance variable
    static int s; // a static variable

    // return the sum of the x and s
    int sum(){
        return x+s;
    }
}
public class SDemo {
    public static void main(String[] args) {

        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();
        // here we will give value to the instance value
        ob1.x = 10;
        ob2.x = 23;
        System.out.println("ob1.x and ob2.x are both independent : "+ ob1.x+" "+ob2.x);

        // let's declare value to the static variable for this we use this pattern
        // className.variableName
        StaticDemo.s = 11;
        System.out.println("ob1.s and ob2.s are both same : "+ob1.s + " " + ob2.s);
        System.out.println("s variable is shared by both object");

    }
}