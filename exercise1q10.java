import java.util.*;
public class exercise1q10 {
    public static void fabonachi(int n){
        int x=0,y=1;
        for(int i=0;i<=n;i++){
            System.out.println(x);
            int next=x+y;
            x=y;
            y=next;
        }
       
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        fabonachi(a);
    
    }
}
