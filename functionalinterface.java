
@FunctionalInterface  //without the annotation which is @FuntioalInterface compiler wont be  knowing that we are writing the functonal interface 
interface A{  //functional interface is interface which has only one method
    void show();  //we cannot directly create object with the interface so creatig the class B and A can used for reference whie creatinng object
   
}

// class B implements A{   //this can be commented as we can defingin own implementation in A in main function 
//     public void show(){
//         System.out.println("b show");
//     }

// }

public class functionalinterface {
    public static void main(String a[]){

        A obj = new A(){
            public void show(){
                System.out.println("show");  //this is anonyms method whhich can be created inside the object
            }
        };

        obj.show();

    }
    
}
