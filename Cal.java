/*Write a program for Arithmetic calculator using switch case menu*/

import java.util.Scanner;
public class Cal {
    public static void main(String args[]) {
    int num1, num2,ans,ch;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the first number\n");
    num1=input.nextInt();
    System.out.println("Enter the second number\n");
    num2=input.nextInt();
    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
    System.out.println("Enter your choice\n");
    ch=input.nextInt();
    switch(ch) {
        case 1:ans=num1+num2;
        System.out.println("The sum is:"+ans);
        break;
        case 2:ans=num1-num2;
        System.out.println("The difference is:"+ans);
        break;
        case 3:ans=num1*num2;
        System.out.println("The product is:"+ans);
        break;
        case 4:ans=num1/num2;
        System.out.println("The division is:"+ans);
        }
    }
}
