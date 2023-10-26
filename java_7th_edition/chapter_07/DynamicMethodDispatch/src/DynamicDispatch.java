// in this we will learn important concept
// Dynamic method dispatch
class Sup{
    void who(){
        System.out.println("who() in Sup");
    }
}
class Sub1 extends Sup{
    @Override
    void who() {
        System.out.println("who() in Sub1");
    }
}
class Sub2 extends Sup{
    @Override
    void who() {
        System.out.println("who() in Sub1");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

//        Sup supRef;
        superOb.who();
        subOb1.who();
        subOb2.who();
    }
}