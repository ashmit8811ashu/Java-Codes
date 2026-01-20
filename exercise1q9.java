import java.util.*;
public class exercise1q9 {
    public static int common(int x,int y){
int gcd=1;
for(int i=1;i<=x&&i<=y;i++){
    if(x%i==0&&y%i==0){
        gcd=i;
    }
}
return gcd;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("the common interger is" + common(a,b));

    }}

