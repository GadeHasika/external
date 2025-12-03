import java.util.*;
class Main{
    public static void main(String[]args){
        try{
            if(Factorial(5)!=120)return new AssertionError("Test failed");
            if(Factorial(0)!=1) return new AssertionError("TestFailed");
            System.out.println("Test passed");
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
    }
}