class A1{

    public void show(){

        System.out.println("a show");

    }

}

class B1 extends A1{
    public void show2(){

        System.out.println("in b show");

    }
}




public class downandupcast {
    public static void main(String[] args) {
        
  A1 obj = (A1) new B1();  //this is up casting where B1 calls the A1 , here object is B1 but it is aksing refer A1
 
  obj.show();


  B1 obj1 = (B1) obj;  //this is down casting
  obj1.show2();

    
    
      }
    
}


// double d = 4.5;
    // int i = (int)d;  // this is the type casting
