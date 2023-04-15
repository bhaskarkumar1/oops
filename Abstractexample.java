abstract class Super{
    public Super(){
        System.out.println("Super Constructor");
    }
   abstract void meth1();

    
}

class Sub extends Super{
    public Sub(){
        System.out.println("Sub Constructor");
    }
    void meth1(){
        System.out.println("Sub method 1");
    }
}

class Abstractexample{
    public static void main(String[] args){
        // Super s;
        // Super s1= new Super();
        Sub s= new Sub();
        s.meth1();

    }
}