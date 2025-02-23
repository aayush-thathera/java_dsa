import java .util.*;
public class Fibonacci_Number {
    public static void main(String[] args) {
       Scanner as=new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int n=as.nextInt();
       int a=0;
       int b=1;
       for(int i=2;i<n;i++){
        int next=a+b;
        System.out.print(next);
        a=b;
        b=next;
       }
    }

}
