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
public class IntArray {
    public int arraysize;
    public int[] myArray;

    public IntArray(int arraysize) {
        this.arraysize = arraysize;
        this.myArray = new int[arraysize];
        int random;
        for (int i = 0; i < this.arraysize; i++) {
            random = (int)(Math.random()*1000);
            this.myArray[i] = random;
        }
    }
    
    public void getSumOfOddNumbers() {
        int sum = 0;
        for (int i = 0; i < this.arraysize; i++){
            if (this.myArray[i]%2 != 0) {
                sum+=this.myArray[i];
            }
        }
        System.out.println("The summ of all Odd numbers from this array is " + sum);
    }
    
    public void getAmountOfEvenNumbers() {
        int count = 0;
        for (int i = 0; i < this.arraysize; i++){
            if (this.myArray[i]%2 == 0) {
                count++;
            }
        }
        System.out.println("The amount of even numbers from this array is " + count);
    }

    @Override
    public String toString() {
        System.out.print(" [ | ");
        for (int i = 0; i < this.arraysize; i++){
            System.out.print(this.myArray[i] + " | ");
        }
        System.out.println("}");
        return "";
    }
    
    
    
    
    
}
