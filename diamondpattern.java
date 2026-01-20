import java.util.*;
public class diamondpattern {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=1;i<=a;i++){
    for(int j=1;j<=a-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print("*"+" ");
    }
    System.out.println();
}
for(int i=1;i<=a;i++){
    for(int l=1;l<=i-1;l++){
        System.out.print(" ");
    }
    for(int m=i;m<=a;m++){
        System.out.print("*"+" ");
    }

    
    System.out.println();
}

    }
}
