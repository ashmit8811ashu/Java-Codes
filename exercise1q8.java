import java.util.*;
public class exercise1q8 {
 public static int pow(int x, int n){
    int result=1;
    for(int i=1;i<=n;i++){
        result *=x;
    }
    return result;
 }


    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.print("enter the power "+pow(a,b));

 }   
}
