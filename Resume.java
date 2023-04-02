/*Write a program to generate the resume. Create 2 Java classes Teacher (data: personal information, qualification, 
experience, achievements) and Student (data: personal information, result, discipline) which implements the java
interface Resume with the method biodata(). */

import java.util.Scanner;
interface resume {
    void biodata(String name,String degree,String experience,
    String designation,String sname,String sd,String result);

}

class Teacher implements resume {

    @Override
    public void biodata(String name, String degree, String experience, String designation, String sname, String sd,
    String result) {
            System.out.println("Teacher details\n");
            System.out.println(name+":"+degree+":"+experience+":"+designation+"\n");
        }
    }
            
class Student implements resume {
    
    @Override
    public void biodata(String name, String degree, String experience, String designation, String sname, String sd,
    String result) {
            System.out.println("Student details/n");
            //System.out.println("Teacher details\n");
            System.out.println(name+":"+degree+":"+":"+result+"\n");
        }
    }

    public class Resume {
        static Scanner input = new Scanner(System.in);
        public static String name, degree, exp, award, sname, result, sd;
        public static void main(String args[]) {
            System.out.println("Enter the teacher name\n");
            name=input.nextLine();
            System.out.println("Enter the teacher's degree\n");
            degree=input.nextLine();
            System.out.println("Enter the teacher's experience\n");
            exp=input.nextLine();
            System.out.println("Enter the teacher's award information\n");
            award=input.nextLine();
            System.out.println("Enter the student name\n");
            sname=input.nextLine();
            System.out.println("Enter the student's result\n");
            result=input.nextLine();
            System.out.println("Enter the student's discipline\n");
            sd=input.nextLine();    
            resume r1=new Teacher();    
            resume r2=new Student();
            r1.biodata(name,degree,exp,award,null,null,null);
            r2.biodata(null,null,null,null,sname,result,sd);
        }
    }
    