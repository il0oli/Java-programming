/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import java.util.Scanner;

/**
 *
 * @author De paul
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         java.util.Vector <Integer> v1 = new java.util.Vector();
    Scanner sc = new Scanner(System.in);
    System.out.println("The size of the array is" + v1.size());
    System.out.println("The capacity of the array is" + v1.capacity());
    
    for (int i = 0; i<10 ;i++)
    v1.add(i+2);
    for (int i=0;i<10;i++)
        System.out.println(v1.elementAt(i)+"");
    
     v1.add(15);
    System.out.println("The size of the array is" + v1.size());
    System.out.println("The capacity of the array is" + v1.capacity());
    
    v1.remove(7);
    System.out.println("After removing an element");
    System.out.println("The size of the array is" + v1.size());
    System.out.println("The capacity of the array is" + v1.capacity());
    
    
    v1.clear();
    System.out.println("After removing all elements");
    System.out.println("The size of the array is" + v1.size());
    System.out.println("The capacity of the array is" + v1.capacity());
    
    
    
    
   
    
    
    
    }
    
}
