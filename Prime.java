/*Write a java program for prime no. by getting input from user */

import java.util.Scanner;
public class Prime { 
    public static void main(String args[]) {
    int num,res=0,i;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number\n");
    num=input.nextInt();
    for(i=2;i<=num/2;i++) {
        if(num%i==0) {
        res=1;
        break;
    }
}
    if(res==1) {
    System.out.println("The number is not prime\n");
    }
    else {
        System.out.println("The number is prime\n");
    }
    }
}
