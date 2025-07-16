package others;


class Launch{
    public void abc(){
        A obj = new A();
        System.out.println(obj.marks);  // here the marks is working as protected is workig in the same package but not the outside
    }
}

public class A {

    protected int marks = 7;  //if we use the protected we cannot use it in the out side the  package

    public void show(){
         
    }
    
}
