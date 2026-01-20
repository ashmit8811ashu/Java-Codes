import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
 char ch=sc.next().charAt(0);
 if(ch=='+'){
    int sum=a+b;
    System.out.print(sum);
 } else if(ch=='-'){
    int sub = a-b;
    System.out.print(sub);
 } else if(ch=='*'){
    int mul=a*b;
    System.out.print(mul);
 } else if (ch=='/') {
     int div=a/b;
     System.out.print(div);
 }

    }
}
