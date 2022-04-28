import java.util.Scanner;

public class Greatest_of_2no {
    public static void main(String[] args) {
        //scanner class declaration
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int largest = 0;

        //conditions
        if(num1 == num2)
            System.out.println("Both numbers are equal");
        else
            largest = (num1 > num2) ? num1 : num2;


        System.out.println(largest + " is the greatest");

        //closing scanner class(not compulsory, but good practice)
        sc.close();
    }
    
}
