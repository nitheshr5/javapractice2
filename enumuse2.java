enum laptop{
    Macbook(455), xps(545), surface, thinkpad(5454);

    private int price;

    private laptop(){  //this is created because i did not added price in surface so this is contructor for the laptop to add price 
        price = 500;
    }

    private laptop(int price){
        this.price = price;
    }

    public int getPrice() {   //we used getprice beacse the price has private keyword so cannot call it directoly in the main funtion
        return price;
    }

    public void setPrice(int price) {  // even this is created for to set the price has the price is private
        this.price = price;
    }

    
}

public class enumuse2 {

    public static void main(String a[]){

        // laptop lap = laptop.Macbook;
        // System.out.println(lap  +" :" +lap.getPrice());

        for(laptop lap : laptop.values()){
            System.out.println(lap + " : "+lap.getPrice());  //this prints all the latops and its price
        }





    }

    
}
