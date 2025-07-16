class a{

public void show(){
    System.out.println("In a shhow");


}

}

class b extends a{
    public void show(){
    System.out.println("In b shhow");


}

}

class c extends a{

        public void show(){
    System.out.println("In c shhow");


}
     
}

public class methoddispatch {    //this are example for run time polymorpism and this called as dynamic method dispatch

    public static void main(String a[]){
        a obj = new a();  // so here a is type of the object and implementation is b so this works here however we cannot b in the place of a as b is subclass of a
                            //here reference of super class and object of subclass
        obj.show();   //this returns a show

        obj = new b();  //here the old value to the obj which is a gets cut so now obj is with the new which is b

        obj.show();    // this returns b show


        obj = new c(); //this returns c show 
        obj.show();

    }
    
}
