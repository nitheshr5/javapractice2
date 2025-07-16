import others.*;


class C extends A{

    public void abc(){
        System.out.println(marks); //here marks works becase we used inheritence from  A where the marks is defined with protected also this works which is outside the package because it is subclass
    }

}

public class accessmod {

public static void main(String a[]){
    A obj = new A();
    System.out.println(obj.marks);  // here we cannot directoly call the marks as we are calling it ffrom others file so which A class where is shoud be defined as public only then it can be called


    B obj1 = new B();  //here the B class in the same package that is from54 so there is not issue while calling the B obj
    System.out.println(obj1.marks);


}
    
}
