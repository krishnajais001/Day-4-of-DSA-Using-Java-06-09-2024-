import java.util.*;
import java.lang.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.print("Enter how many times do u want :");
        int num=val.nextInt();
        
        for(int i=0;i<num;i++){
            char ch='A';
            for(int j=0;j<num;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

       
    }
}
