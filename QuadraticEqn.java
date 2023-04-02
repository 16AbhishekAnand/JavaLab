/*. Write a java program that prints all real solutions to the quadratic equation ax2+bx+c=0. 
Read in a, b, c and use the quadratic formula */

import java.util.Scanner;
public class QuadraticEqn {
    
        public static void main(String args[]) {
        
        double a,b,c,det,root1,root2,real,imaginary;
        Scanner input=new Scanner(System.in);
        System.out.println(" give value of a,b,c");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        det=b*b-4*a*c;
        if(det>0) {
        root1=(-b+Math.sqrt(det))/(2*a);
        root2=(-b-Math.sqrt(det))/(2*a);
        System.out.println("root1= "+root1+"root2 ="+root2);
        }
        if(det==0) {
        root1=root2=-b/(2*a);
        System.out.println("roots are equal"+root1);
        }
        if(det<0) {
        real=root2=-b/(2*a);
        imaginary=Math.sqrt(-det)/(2*a);
        System.out.println("Roots are real and img"+real+imaginary);
        }
    }
}
        

    

