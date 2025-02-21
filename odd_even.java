import java.util.*;
public class odd_even{
    public static void main(String[] args) {
        Scanner as=new Scanner(System.in);
        System.out.println("Enter the a number");
        int a=as.nextInt();
        if(a%2==0){
            System.out.println("Give number is prime:"+ a);
        }else{
            System.out.println("give number is not prime");
        }
    }
}