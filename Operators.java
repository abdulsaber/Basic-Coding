import java.util.Scanner;

public class Operators{
    public static void main(String[] args) {
        System.out.println("enter any two integer value");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("the addition of "+ x +" and "+ y +" is "+ (Add(x,y)));
        System.out.println("the subtraction of "+ x +" and "+ y +" is "+ (Sub(x,y)));
        System.out.println("the multiplication of "+ x +" and "+ y +" is "+ (Mul(x,y)));
        System.out.println("the division of "+ x +" and "+ y +" is "+ (Pow(x,y)));
        System.out.println("the power of "+ x +" and "+ y +" is "+ (Add(x,y)));
        System.out.println("the modulus of "+ x +" and "+ y +" is "+ (Rem(x,y)));
    }

        static int Add(int x, int y) {
            int sum = x+y;
            return sum;
        }
        static int Sub(int x, int y) {
            int sub = x-y;
            return sub;
        }
        static int Div(int x, int y) {
            int div = x/y;
            return div;
        }
        static int Rem(int x, int y) {
            int rem = x%y;
            return rem;
        }
        static int Mul(int x, int y) {
            int mul = x*y;
            return mul;
        }
        static double Pow(int x, int y) {
            double pow = Math.pow(x, y);
            return pow;
        }














}
