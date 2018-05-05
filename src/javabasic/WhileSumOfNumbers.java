/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 *
 * @author shadmin
 */
public class WhileSumOfNumbers {
    public static void main(String args[]){
        int n=6;
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum="+ sum);
    }
}
