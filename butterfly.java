import java.util.*;

public class butterfly {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
     int a=sc.nextInt();
     for(int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int k=1;k<=2*(a-i);k++){
        System.out.print(" ");
        }
        for(int m=1;m<=i;m++){
            System.out.print("*");
        }

        System.out.println();

     }

     for(int i=1;i<=a;i++){
        for(int n=i;n<=a;n++){
            System.out.print("*");
        }
        for(int o=1;o<=2*(a+i-(a+1));o++){
             System.out.print(" ");
        }
        for(int n=1;n<=a-i+1;n++){
            System.out.print("*");
        }

         System.out.println();
     }




    }
}
