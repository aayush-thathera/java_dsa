import java.util.*;
public class Linear_Search_1darray {
    public static void main(String[] args) {
        Scanner as =new Scanner(System.in);
        System.out.println("enter the size of array");
        int x=as.nextInt();
        int[] num=new int[x];
        for(int i=0;i<x;i++){
            num[i]=as.nextInt();
        }
        System.out.println("enter number who is search");
        int n=as.nextInt();
        for(int i=0;i<x;i++){
            if(num[i]==n){
                System.out.println(i);
            }
        }
        // print 
        // for (int i=0;i<x;i++){
        //     System.out.println(num[i]);
        // }
    }
}
