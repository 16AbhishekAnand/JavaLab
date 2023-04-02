/*10. Write a Java program to read two integers a and b. Compute a/b and print, when b is not zero. Raise an 
exception when b is equal to zero.*/

import java.util.Scanner;

public class Throw {
    public static void main(String args[]) {
        
        int x,y,res;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the num X&Y\n");
        x=obj.nextInt();
        y=obj.nextInt();
        try {
            res = x/y;
            System.out.println(res);
        }
        catch(ArithmeticException e) {
            System.out.println("Invalid input");
        }
    }
}
