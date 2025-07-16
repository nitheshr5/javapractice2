class laptop{
    String model;
    int price;

    public String toString(){  //if we do not create and use toString() here the obj calls the this method defaultly
        return model + ":" +price;
    }


    public boolean equals(laptop that){

        if(this.model.equals(that.model) && this.price == that.price)
            return true;
        
        else
        return false;
    }
}

public class tostringuse {

    public static void main(String a[]){

        laptop obj = new laptop();
        obj.model = "lenovo";
        obj.price = 1000;


        laptop obj2 =  new laptop();
        obj2.model = "lenovo";
        obj2.price = 1000;


        boolean result = obj.equals(obj2); //here it does not uses the inbuilt equals as I have defined one metod called equals in the above class so it uses that. 

        System.out.println(result);



        // System.out.println(obj);  //this returns laptop@28a418fc  which is the value of obj coz whenever we print obj it calls the toString() method defaulty even though we do not mention
                                    // when we create the toString method manualy and call it then it retrn the user givn value

    }
    
}
