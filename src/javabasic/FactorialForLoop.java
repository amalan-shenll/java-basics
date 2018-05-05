
package javabasic;

//this program will show you how to find factorial of a number using for loop
public class FactorialForLoop {
    public static void main(String arg[]){
        int n=5;
        int fact=1;
        for(int i=1; i<=5; i++){
            fact *= i;
        }
        System.out.println("Factorial of "+ n + " is "+ fact);
    } 
}
