class Circle{
    private double radius;
    
    // constructor
    public Circle(){
        radius=1;

    }

    //method

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

}

// Cyclinder

class Cyclinder extends Circle{
    private double height;

    //constructor
    public Cyclinder(){
        height=1;

    }

public double volume(){
    return area()*height;
}

public double circumference(){
    return perimeter()*height;
}


}

class Inheritcircle{
public static void main(String[] args){
    Cyclinder c1=new Cyclinder();
    System.out.println(c1.volume());
    System.out.println(c1.circumference());
}



}