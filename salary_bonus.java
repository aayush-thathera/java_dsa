import java.util.*;
public class salary_bonus {
    public static void main(String[] args) {
        Scanner as=new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary=as.nextInt();
        if(salary>10000){
            salary=salary+2000;
        }else{
            salary=salary+1000;
        }
        System.out.println(salary);
    }
}
