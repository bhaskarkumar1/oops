class Circle{
    private double radius;



    public double area(){
        return Math.PI*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }


    //getter and setter method
    public void getRadius(){
        System.out.println(radius);

    }

    public void setRadius(double r){
        radius=r;
        System.out.println("set new radius = "+radius);
    }
//constructor

public Circle(){
    radius=1;
}

public Circle(double t){
    if(t>0) radius= t;
    else radius=0;
}

}


class Testcircle{
    public static void main(String[] args){
        Circle c= new Circle(5);
        // c.getRadius();
        // c.setRadius(5);
        System.out.println("area ="+c.area());
        System.out.println("Perimeter = "+c.perimeter());

    }
}