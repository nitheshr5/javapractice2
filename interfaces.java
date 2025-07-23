interface A5{   //this is the example for interface(interface is kinda class which has metod with public abstract defaultly) however this line had abstract class A5 now it is changed to interface but there was no error

    // int age;  //this does not work in interface as variables are declared with static and final keyword so we are getting error for this
    // String area;

    int age = 5;    //this will work as these are final and static by default in interface
    String area = "karkala";


    void show();  //in interface methods are public abstract by deafult so we are removing the public abstract
    void config(); //interface just tells what method is needed but we have to implement it in other class



}

class B5 implements A5{   //here we are using implements instead of extends becasuse A5 is interface not the class  and we have implenent both the show and confif method here
                            //in implements we get only the method and not the var

    public void show(){

        System.out.println("in a show");

    }

    public void config(){

        System.out.println("in a config");
        
    }


}

public class interfaces {

    public static void main(String a[]){
        A5 obj;
        obj = new B5();

        obj.show();
        obj.config();

        // A5.area = "Bnga"; //this cannot work here as area is final and static by default
        System.out.println(A5.area); // as area is final and static we can direcly call it without object

         
    }
    
}
