import inheritance.Parent;

public class Child extends Parent {
    public void m1(){
        System.out.println("This is m1 method in child class.");

    }
    public static void main(String[] args){
        Child obj = new Child();
        obj.m1();
        Parent obj1= new Parent ();
        obj1.m1();
        Parent obj2 = new Child();
        obj2.m1();

    }
}
