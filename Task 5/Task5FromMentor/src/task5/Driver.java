/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

/**
 *
 * @author User
 */
public class Driver {
    
    public static void main(String[] args) {
        IntArray newArray = new IntArray(10);
        System.out.println(newArray);
        newArray.getSumOfOddNumbers();
        newArray.getAmountOfEvenNumbers();
    }
}
