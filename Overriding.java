
class Super{
    void display(){
        System.out.println("Super class ");

    }
}

class Sub extends Super{
    // @Override
    void display(){
        System.out.println("Sub class ");
    }
}

public class Overriding {
public static void main(String[] args) {
    // Super su=new Super();
    // su.display();

    // Sub sub=new Sub();
    // sub.display();

    Super su = new Sub();
    su.display();

}        

    }


