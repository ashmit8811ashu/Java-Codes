import java.util.*;
public class arrays1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
       // int[] marks=new int[100];
            int[]marks=new int[size];
       // marks[0]=98;
       // marks[1]=31;
       // marks[2]=43;
       for(int i=0;i<size;i++){
        marks[i]=sc.nextInt();
       }
       int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(marks[i]==x){
                 System.out.println(i);
            }
           
        }

    }}

