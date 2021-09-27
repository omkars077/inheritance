package inheritance;

public class MethodOverLoading {
    public void demo1(){
        System.out.println("This is new subject in inheritance .");

    }
    public void demo1(int a){
        System.out.println("This is first method .");
    }
    public void demo1(String s){
        System.out.println("This is second method .");

    }
    public void demo1(int a ,String s){
        System.out.println("This is third method .");
    }
    public static void main(String[] args){
        MethodOverLoading obj= new MethodOverLoading();
        obj.demo1();
        obj.demo1(38);
        obj.demo1(1,"Java is a unique language.");
        obj.demo1("Hello");
    }
}
