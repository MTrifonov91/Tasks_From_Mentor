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
public class SortArray {
    public int arraySize;
    public int[] myArray;

    
    public SortArray(int arraySize) {
        this.arraySize = arraySize;
        this.myArray = new int[arraySize];
        int random;
        for (int i = 0; i < this.arraySize; i++) {
            random = (int)(Math.random()*1000);
            this.myArray[i] = random;
        }
    }
    
    public void bubbleSort() {
        for (int i = this.arraySize-1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if(this.myArray[j] > this.myArray[j+1]) {
                   swapValues(j, j+1); 
                }
            }
        }
    }
        
    public void swapValues(int first, int second) {
        int temp = this.myArray[first];
        this.myArray[first] = this.myArray[second];
        this.myArray[second] = temp;
    }
    
    @Override
    public String toString() {
        System.out.print(" [ | ");
        for (int i = 0; i < this.arraySize; i++){
            System.out.print(this.myArray[i] + " | ");
        }
        System.out.println("}");
        return "";    
        
    }
    
}
