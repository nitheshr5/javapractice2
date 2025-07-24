class A{  //the this is here we two methods in A and B and method name is same but i made mistake one spelling mistake so the method overdiding is not happening.
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in a show");
    }
}

class B extends A{
        @Override  //so by using annotation which is inbuilt annotaion which is override helps us to find the mistakes in method names and then we can correct
        public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in b show");
    }
    

}

public class annotation {
    public static void main(String[] args) {

        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();


        
    }
    
}
