import java.util.*;
class Test{
    public static void main(String[]args){
        try{
            if(Fact.Factorial(5)!=120) throw new AssertionError("Test failed");
            if(Fact.Factorial(0)!=1) throw new AssertionError("TestFailed");
            System.out.println("Test passed");
        }
        catch(Exception e){
            System.out.println("Exception occured"+ e.getMessage());
        }
    }
}
