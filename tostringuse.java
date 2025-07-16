class laptop{
    String model;
    int price;
}

public class tostringuse {

    public static void main(String a[]){

        laptop obj = new laptop();
        obj.model = "lenvo";
        obj.price = 1000;

        System.out.println(obj);  //this returns laptop@28a418fc  which is the value of obj coz whenever we print obj it calls the toString() method defaulty even though we do not mention


    }
    
}
