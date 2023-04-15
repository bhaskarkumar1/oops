class Rectangle{
    private double length;
    private double breadth;


    public double perimeter(){
        return 2*(length+breadth);
    }

    public double area(){
        return length*breadth;
    }

//now we need to get constructor working here 

// non-parameterized
public Rectangle(){
    length=1;
    breadth=1;
}
//parameterized
public Rectangle(double l, double b){
    if(l>0) length=l;
    else length=0;
    if(b>0) breadth=b;
    else breadth=0;
}

}

class Testrectangle{
    public static void main(String[] args){
        // Rectangle r=new Rectangle();
        Rectangle r=new Rectangle(4.0,4.0);

        System.out.println("area= "+r.area());
        System.out.println("perimeter= "+r.perimeter());
    }
}