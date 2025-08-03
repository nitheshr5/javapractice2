@FunctionalInterface
interface A{

    void show(int i);

}

public class lambda {
    public static void main(String a[]){   //this is the examoke for the lambda as if we are not using lambda we can use the show inside the object as we are using interface 
        A obj = i -> System.out.println("in A show" +i);
            
            
        
        obj.show(7);
    }
    
}
