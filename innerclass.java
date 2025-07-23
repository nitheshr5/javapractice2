class A2{      //this is the example for inner class where we are trying to call the inner class method in the main function

    int age;
    public void show(){

        System.out.println("this is show");

    }
      

      static class B2{

        public void config(){
            System.out.println("in config");
        }

    }
}

public class innerclass {

    public static void main(String a[]){
        A2 obj = new A2();
        obj.show();
        // A2.B2 obj2 = obj.new B2();  // we are calling the config which is method from inner class so this is how we call it using the main class

        A2.B2 obj2 = new A2.B2();  //this is used when the inner class is used static keyword when defining and when we are not usinf static then we can use the above one
        obj2.config();
        


    }
    
}



//anonymous inner class example

class A3{

    public void show(){
        System.out.println("in a show");
    }


}



public class anonymousinnner{

    public static void main(String a[]){


        A3 obj = new A3()
        {                             // this the anonymous class as after we run this code there will be no class file is created it shows as 1 
            public void show(){    //this is the new kind a adding method after createing the object and it prints the this show first after we run it  
                System.out.println("in new show");
            }
        }; 
        obj.show();
    }

}