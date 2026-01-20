import java.util.*;

public class ifelse {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int sum=a+b;
     if(sum>18){
        System.out.print("adult");
     }
     else{
        System.out.print("minnor");
     }
    }
}
