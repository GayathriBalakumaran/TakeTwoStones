import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner kbd=new Scanner(System.in);
        int i=kbd.nextInt();
        if((i>=1) && (i<=10000000)){
            i=i%2;
            if(i==0){
                System.out.print("Bob");
            }
            else{
                System.out.print("Alice");
            }
        }
    }
}