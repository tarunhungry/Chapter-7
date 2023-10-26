// in this we will learn about the variable length argument
// which mean we don't have to specify the number of arguments

class VarArgs{
    void vaTest(int ... v){
        System.out.println("Number of Arguments : "+ v.length);
        System.out.println(" Content : ");
        for(int i=0; i<v.length;i++){
            System.out.print(v[i]+ " ");
        }
        System.out.println();
    }
}

/*
*  We can also use other type of parameter but the conditon will be that variable-length parameter will be the last parameter
* 
* */
public class Main {
    public static void main(String[] args) {
        VarArgs temp = new VarArgs();
        temp.vaTest(10); // only single argument
        temp.vaTest(1,75,78); // three argument
        temp.vaTest(); // zero argument
    }
}