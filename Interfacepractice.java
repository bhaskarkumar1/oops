interface test1{
    void meth1();
    void meth2();
}

class test2 implements test1{
    public void meth1(){
        System.out.println("Test2 meth1");
    }

    public void meth2(){
        System.out.println("Test 2 meth2");
    }
}



class Interfacepractice{
    public static void main(String[] args) {
        test1 t=new test2();
        t.meth1();
        t.meth2();
    }
}