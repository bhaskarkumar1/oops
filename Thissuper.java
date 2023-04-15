class Rectangle{
    public int length;
    public int breadth;
    int x=10;

    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    void display(){
        System.out.println("length= "+length);
        System.out.println("breadth= "+breadth);

    }

}

 class Cuboid extends Rectangle{
    int height;
    int x=20;

    Cuboid (int l,int b,int h){
        super(l,b);
        height=h;
    }

    void display(){
        System.out.println("Parent value of x = "+super.x);
        System.out.println("current value of x= "+x);
    }
}


class Thissuper{

    public static void main(String[] args){
            Rectangle r= new Rectangle(5, 5);
            r.display();
            Cuboid c=new Cuboid(12, 2, 3);
            c.display();

    }
}


