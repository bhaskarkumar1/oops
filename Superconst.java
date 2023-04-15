class Parent{
    
    public Parent(){
        System.out.println("This is non-param Parent constructor");
    }
    public Parent(int x){
        System.out.println("THis is param parent Constructor");
    }
    


}

class Child extends Parent{
    public Child(){
        System.out.println("This is non-param Child constructor");

    }

    public Child(int y){
        System.out.println("This is param child constructor");
    }

    public Child (int x, int b){
        super(x);
        System.out.println("This is param child constructor "+b);

    }

}


public class Superconst {
    public static void main(String[] args){
        // Parent p= new Parent(5);
        Child c= new Child(1,2);
    }
}
