
import java.util.*;
public class mulfunction {
    public static int calculate_mul(int a,int b){
         int mul =a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
            int x=sc.nextInt();
            int y=sc.nextInt();
           int mult= calculate_mul(x,y);
           System.out.print(mult);
    }}
