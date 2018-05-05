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
public class IfCondition {
    public static void main(String[] args) {
    // TODO code application logic here
        int a=5;
        int b=5;
        int c=7;
        if(a==b){
            System.out.println(a +" and "+ b + " are equal");
        }
        if(a==c){
            System.out.println(a +" and "+ c + " are equal");
        } else {
            System.out.println(a +" and "+ c + " are not equal");
        }
    }
}
