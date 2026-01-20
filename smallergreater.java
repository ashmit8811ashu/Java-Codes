import java.util.*;
public class smallergreater {
    public static void main(){
Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
if(a>18){
    System.out.print("adult");
}
else if(a<18&&a>12){
    System.out.print("mature");
}
else if(a<12&&a>0){
    System.out.print("minnor");
}
    }
}
