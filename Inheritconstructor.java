class Parent{

    public Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
}

class Grandchild extends Child{
    public Grandchild(){
        System.out.println("Grandchild Connstructor");
    }
}



public class Inheritconstructor {
    public static void main(String[] args){
        // Parent p= new Parent();

        // Child c= new Child();
        Grandchild g= new Grandchild();
    }
}
