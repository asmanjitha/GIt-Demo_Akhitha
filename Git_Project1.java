/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_project1;

/**
 *
 * @author manjitha
 */
import java.util.Scanner;
public class Git_Project1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int a;
        int b;
        
        String operation;
        int answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my Calculator");
        System.out.println("Enter a number");
        a = scanner.nextInt();
        System.out.println("Enter the second number");
        b = scanner.nextInt();
        System.out.println("Enter an Operation");
        operation = scanner.next();
        if ("+".equals(operation)){
            answer = add(a,b);
            System.out.println(answer);
        }else{
            System.out.println("Unsupported operation");
        }
        
        
    }
    private static int add(int a,int b){
        return a+b;
    }
    


}
    

