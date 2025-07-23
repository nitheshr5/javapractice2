public class wrapper {   //this is the example for wrapper class where we can use primitive types(eg int) as object(eg: Integer)

    public static void main(String a[]){
        int num = 7;
        // Integer num1 = new Integer(num) ;   // this is called as boxing where taking the primitive vlaue to the primitive object

        Integer num1 = num; // this is autoboxing where the int is getting converted to reference var which is obj
                            //so here Integer is wrapper class
        // int num2 = num1.intValue(); //we are assiging the object type integer to the int

        int num2 = num1;  //this is auto unboxing
        System.out.println(num2);


        String str = "12";
        int num3 = Integer.parseInt(str); //Integer is the wrapper class and it provides the multiple features such as parseInt which converts str to int

        System.out.println(num3+2);
    }
    
}
