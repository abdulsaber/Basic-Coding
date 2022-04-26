import java.lang.Math;
import java.util.*;

public class Squareroot_Cuberoot {
    public static void main (String[]args)
  {
    try (Scanner sc = new Scanner (System.in)) {
        int x = sc.nextInt ();
        

          System.out.println ("The square root of " + x + " is : " + SquareRoot (x));
          int y = sc.nextInt ();
          System.out.println ("The cube root of " + y + " is : " + CubeRoot (y));
    }


  }
  static double SquareRoot(int x)
  {
    double sq;
    sq = Math.sqrt(x);
    return sq;
  }
    static double CubeRoot(int y)
  {
    double cb;
    cb = Math.cbrt(y);
    return cb;
  }

    
}