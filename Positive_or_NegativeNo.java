import java.util.Scanner;

public class Positive_or_NegativeNo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = sc.nextInt();
        
        if(n<0){
            System.out.println("Negative number");
        }else if(n>0){
            System.out.println("Positive number ");
        }else{
            System.out.println("Enter valid number");
        }
    }
    
}
