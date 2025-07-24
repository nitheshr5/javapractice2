enum Status{     //this is the example for the enum where this is used in servers and client. Here status is class and inside it like running failed and all are objects
    Running, Failed,Pending,Success;  //these are named constant and starts from 0 to 3 like a index
}


// public class enumuse {    
//     public static void main(String a[]){
//         int i = 5;
//         // Status s  = Status.Running;  //here s is having the status running and also Status is works as type here
//         // // System.out.println(s);  // this gives running
//         // System.out.println(s.ordinal()); // this gives the index of running which is 0



//         //to print all the status we have a diifferent approch

//          Status[] ss  = Status.values();   // here values will return it in array so we have to use array here

//          for(Status s : ss){
//             System.out.println(s + " :" +s.ordinal());

//          }
//     }
    
// }


//--------------------------------------------------
//enum is using if else and switch case

public class enumuse {

    public static void main(String a[]){
        Status s = Status.Success;


        // if(s == Status.Running)  
        //     System.out.println("All good");
        // else if(s == Status.Failed)
        //     System.out.println("Try again");
        // else if(s == Status.Pending)
        //     System.out.println("wait");
        // else
        //     System.out.println("Done");  

        switch(s)
        {
            case Running:
            System.out.println("all good");
            break;

            case Failed:
            System.out.println("try again");
            break;

            case Pending:
            System.out.println("wait");
            break;

            default:
                System.out.println("Done");
                break;

        }

    }


}