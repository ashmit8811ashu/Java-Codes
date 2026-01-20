import java.util.*;
public class function1 {
    public static void yourname(String name){
        System.out.print(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        yourname(name);
    }
}
