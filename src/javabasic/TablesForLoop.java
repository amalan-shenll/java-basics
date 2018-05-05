//this program uses for loop to print mutiplication tables of a number
package javabasic;

public class TablesForLoop {
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=10; i++){
            System.out.println(n + " * "+ i + " = "+ (n*i));
        }
    }
}
