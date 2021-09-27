package inheritance;

public class B {

    public void demo1(){
        System.out.println("This is all about inheritance .");
    }
    public void demo2(){
        System.out.println("This is parent class.");
    }
    public static void main(String[] args){
        B object = new B();
        object.demo1();
    }
}
