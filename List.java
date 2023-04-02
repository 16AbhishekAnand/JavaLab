/*Write a program to perform string operations using ArrayList. Write functions for the following 
a. Append - add at end 
b. Insert – add at particular index 
c. Search d. List all string starts with given letter.*/



import java.util.*;
import java.util.ArrayList;

public class List {
    
   public static void main(String args[]) {
    ArrayList<String> branch = new ArrayList<String>();
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the total no. of branches\n");
    int n = inp.nextInt();
    branch.add("CSE"); branch.add("AI&ML"); branch.add("Mech");
    branch.add("Civil"); branch.add("ECE"); branch.add("ISE");
    // for(int i=0;i<n;i++) {
    //     branch.add(inp.nextLine());
    //     inp.next();
    // }
    //  for(int i=0;i<n;i++) {
    //      System.out.println(branch);
    //  }

        System.out.println(branch);
        int index = branch.size();
        System.out.println(index);
        branch.add("production");
        branch.set(3,"Aerospace");
        System.out.println(branch);
        // To check whether contian input field.
        System.out.println("Enter the branch");
        String field = inp.next();
        boolean check = branch.contains(field);
        if(check==true) {
            System.out.println("found\n");
        }
        else {
            System.out.println("Not found\n");
        }
        System.out.println("Enter the first element to search\n");
        String letter = inp.next();
        //comparing user and list 0th index.
        for(String element:branch) {
            if(element.charAt(0)==letter.charAt(0)) {
                System.out.println(element);
            }
            else {
                break;
            }
        }
    }
}