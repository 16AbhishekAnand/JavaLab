/*Create a Java class called Student with the following details as variables within it.
(i)	USN (ii) Name
(iii) Branch (iv) Phone
Write a Java program to create n Student objects and print the USN, Name, Branch, and Phone of these objects with
suitable headings.
*/

import java.util.Scanner;
class Student 
{
String USN, Name, Branch, Phone; 
Scanner input = new Scanner(System.in);
void read() 
{
System.out.println("Enter Student Details"); 
System.out.println("Enter USN");
USN = input.nextLine();
System.out.println("Enter Name"); 
Name = input.nextLine();
System.out.println("Enter Branch");
Branch = input.nextLine();
System.out.println("Enter Phone"); 
Phone = input.nextLine();
}
void display() 
{
System.out.println(USN+"  "+Name+"  "+Branch+"  "+Phone); 
}
}




public class Studentdetail {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the total Students");
        int n = inp.nextInt();

        Student s[] = new Student[n];
        for(int i=0;i<n;i++) {
            s[i] = new Student();
            s[i].read();
        }
        System.out.println("Student details :");
        System.out.println("USN\tName\tBranc\tphone\t");
        for(int i=0;i<n;i++) {
            s[i].display();
        }
    }
}


