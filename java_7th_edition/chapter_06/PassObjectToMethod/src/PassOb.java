// Object can be passed to methods
class Block{
    int a,b,c;
    int volume;

    // constructor
    Block(int i, int j, int k){
        a=i;
        b=j;
        c=k;
        volume = a*b*c;
    }
    // return true if ob defines same block
    boolean sameBlock(Block ob){
        return ob.a == a && ob.b == b && ob.c == c;
    }
    boolean sameVolume(Block ob){
        return ob.volume == volume;
    }
}


public class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10,2,5);
        Block ob2 = new Block(10,3,5);
        Block ob3 = new Block(10,2,5);

        System.out.println("ob1 and ob2 have same dimensions : "+ ob1.sameBlock(ob2));
        System.out.println("ob1 and ob3 have same dimensions : "+ ob1.sameBlock(ob3));
        System.out.println("ob1 and ob2 have same volume: "+ ob1.sameVolume(ob2));
        System.out.println("ob1 and ob3 have same volume: "+ ob1.sameVolume(ob3));
    }
}