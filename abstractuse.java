abstract class Car{   //here Car is abtract concept because no body the buys the car we buy the real car like wgnr or fortunar 
    public abstract void drive();     //after defining the this method but inside the bracket there is nothing so we are declaring the method by removing the culry brackets
                                            //we have used abtract keyword becuase we have declared the method here but define it in the wgnr class
                            //car doesnt know to drive when we create the new wgnr car it should know to drive or we should implement drive method in it
                            // we have to use abstarct for main class as well as we are extending the wgnr with the car
    
 public abstract void fly();   
 public void playMusic(){

        

        System.out.println("plying the music");

    }
}

class wognr extends Car{

    public void drive(){  //here we have defined the drive as wgnr is responisible for drive method

    System.out.println("driving");
    }

    public void fly(){
        System.out.println("flying");
    }


}


public class abstractuse {
    

    public static void main(String a[]){
        // Car obj = new Car(); // we cannot create the object  of the abstract class
        
        Car obj = new wognr();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
 