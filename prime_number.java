import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner as=new Scanner(System.in);
        System.out.println("Enter the number");
        int a =as.nextInt();
        int count=0;
        for (int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println(a+" "+"is prime");
        }else{
            System.out.println(a+" "+" is not prime");
        }
    }
}

