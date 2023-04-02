/*11. Write a Java program that reads a file name from the user displays information about whether the file exists, 
readable, writable, file length and type.*/

import java.io.File;
import java.util.Scanner;

public class Inp {
    public static void main(String args[]) {
        String fname,fexist;
        int index = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the file name\n");
        fname = inp.nextLine();
        File f1 = new File(fname);
        try {
            if(f1.createNewFile()) {
                System.out.println("The file is "+f1.getName());
            }
            else {
                System.out.println("File is not created\n");
            }
            if(f1.exists()) {
                System.out.println("The file size "+f1.length());
                fexist = f1.toString();
                index = fexist.lastIndexOf('.'); // index of fullstop.
                if(index>0) {
                    System.out.println("The type of file is: "+fexist.substring(index+1));
                }
                else {
                    System.out.println("The file do not exist\n");
                }
                if(f1.canWrite()) {
                    System.out.println("The file is writable\n");
                }
                else {
                    System.out.println("The file is not writeable");
                }
                if(f1.canRead()) {
                    System.out.println("The file is readable");
                }
                else {
                    System.out.println("The file is not readable ");
                }

            }

        }
        catch(Exception e) {
            System.out.println("could not able to create file\n");
        }
    }
}
