

import java.util.*;
public class factfunxtion {
    public static void factorial(int a){
    int fact=1;
    for(int i=a;i>=1;i--){
        fact=fact*i;
    }
 System.out.print(fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
            int x =sc.nextInt();
               
           factorial(x);
          
    }}
