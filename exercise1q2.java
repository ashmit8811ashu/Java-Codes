import java.util.*;
public class exercise1q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
            sum=sum+(i+1)/2;
        }
        System.out.print(sum);
    }
}
