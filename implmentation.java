abstract class A4{   //this is the example for abtract and anonyms class together
    public abstract void show();

    public abstract void config();

}

// class B4 extends A4{

//     public void show(){
//         System.out.println("in b show");
//     }

// }
public class implmentation {

    public static void main(String a[]){
        A4 obj = new A4()
        {
            public void show(){
                System.out.println("New show");
            }

            public void config(){
                System.out.println("New yooshow");
            }
        };
        obj.show();
        obj.config();


    }
    

}
