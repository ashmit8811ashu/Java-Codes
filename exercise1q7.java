import java.util.*;
public class exercise1q7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=0,n=0,z=0;
        for(int i=1;i<=a;i++){
           System.out.println("enter the number"+i+" : "); 
           int num=sc.nextInt();
                if(num>0){
                    p++;
                }
                else if(num<0){
                    n++;
                } else{
                    z++;
                }
        }
        System.out.print(p);
         System.out.print(n);
          System.out.print(z);
    }
}
