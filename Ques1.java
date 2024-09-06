import java.lang.*;
import java.util.*;
public class Ques1{
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.print("Enter how many times do u want :");
        int num=val.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }
}