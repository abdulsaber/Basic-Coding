import java.util.Scanner;

public class First_n_naturalno{
    public static void main(String[] args) {
        int n,i=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n");
        n=sc.nextInt();
        //using while loop
        while(i<=n){
            
            System.out.println(i);
            i++;

        }
        
    }
}