@FunctionalInterface
interface C{
    int add(int i, int j);
}

public class lambda2 {

    public static void main(String a[])  //this is the exampe for lambda to return any thing here we have used add method, lambda is used when only we use functionalinterface
    {
        C obj = (i,j) -> i + j;    //functional interface can have only one method in interface
            
        

        int res = obj.add(5,6);
        System.out.println(res);



    }
    
}
