import java.util.Scanner;

public class voting_system {

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you age:");
        age = sc.nextInt();
        
        if(age<18){
            System.out.println("Not eligible for voting");
        }else{
            System.out.println("Eligible for voting");
        }






    }
    
}
