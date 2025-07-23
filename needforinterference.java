//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

interface  computer{
    void code();
}    

class laptop implements  computer{
    public void code()
    {
        System.out.println("code, compile, run");
    
    }
}

class desktop implements computer{
    public void code()
    {
        System.out.println("code, compile, run faster");
    
    }
}

class Developer{
    public void devApp(computer lap){
        lap.code();
    }
}

public class needforinterference {

    public static void main(String a[]){

        computer lap = new laptop();  //reference of parent class and obj of sub class
        computer desk = new desktop();  //here it is interface reference but not the class reference


        Developer nithesh = new Developer();
        nithesh.devApp(lap);    //here we can use lap or desk so it call the class of them


        }
    
}

