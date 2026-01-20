import java.util.*;

public class halfpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    
    for(int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        
        System.out.println();
    }
     for(int i=a;i>=1;i--){
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        
        System.out.println();
    }
    for(int i=1;i<=a;i++){
        
        for(int n=1;n<=a-i;n++){
            System.out.print(" ");
        } 
        for(int m=1;m<=i;m++){
            System.out.print("*");
        }
        
        System.out.println();
    }
    for(int i=1;i<=a;i++){
          for(int m=1;m<=i;m++){
            System.out.print(" ");
        }
        for(int n=1;n<=a-i;n++){
            System.out.print("*");
        } 
      
        
        System.out.println();
    }

    }}

