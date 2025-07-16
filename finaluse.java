
//final can be used with variable, method, class

//variable
// public class finaluse{   //final used as constant in variable

//     public static void main(String a[]){


//         final int num = 8; // so we have assigned num with the final so thete is no chance of changing the value of num
//         num = 9;
//         System.out.println(num); //this returns the 9 as it is the recent value of nums

//     }
    
// }


//class

// final class calc{     // we use final here this class cannot be inheritated from other class
//     public void show(){

//         System.out.println("in calc show");


//     }

//     public void add(int a, int b){
//         System.out.println(a+b);
         

//     }

//     class advance extends calc{  // when we do not want to iherit from calc we should use final in the calc so here we will get the error as we cannot inherit the super class

//     } 

// }
// public class finaluse{  

//     public static void main(String a[]){

//         calc obj = new calc();
//         obj.show();
//         obj.add(5,6);




        
//     }
    
// }


//method
  class calc{     
    public final void show(){

        System.out.println("in calc show");


    }

    public void add(int a, int b){
        System.out.println(a+b);
}
         

    }

    class advance extends calc{  

        public void show(){
            System.out.println("from nithesh"); // after writing final in show method of super class the show from this sub advace wont work as it does not supprt overiding if we use final keyword
        }
    } 


public class finaluse{  

    public static void main(String a[]){

        advance obj = new advance();  //this also gives the same outut as before as advance is inherieted from calc
        obj.show();   //but here it overides as we have same method name show as super class but if we do not want to overide we sould use final keyword in methd
        obj.add(5,6);




        
    }
    
}

