
package lab.java;
import java.util.Scanner;
public class LabJava {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a sentence");
    String str=input.nextLine();
    String reverse="";
    for(int i=str.length()-1;i>=0;i--){
        reverse=reverse+str.charAt(i);
        
    }
        System.out.println("Reversed string is:"+reverse);
    }
}
    

