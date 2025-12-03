import java.util.*;
class Main{
    public static void main(String[]args){
        int n=5;
        System.out.println(Factorial(5));

    }
    public static long Factorial(int n){
        long result=1;
        for(int i=1;i<=n;i++) result*=i;
        return result;
    }
}