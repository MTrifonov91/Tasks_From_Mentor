/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubbleSortIntArray;

/**
 *
 * @author User
 */
public class Driver {
    
    public static void main(String[] args) {
        SortArray newArray = new SortArray(7);
        System.out.println(newArray);
        newArray.bubbleSort();
        System.out.println(newArray);
        
    }
    
}
