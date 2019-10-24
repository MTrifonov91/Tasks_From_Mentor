/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseFloatArray;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ReverseFloatArray {
    static int arraySize;
    static float[] myFloatArray;
    static float[] reversedArray;
    
    static void getSize() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size");
        arraySize = in.nextInt();
    }
    
    static void getArray() {
        myFloatArray = new float[arraySize];
        float randfloat;
        for (int i = 0; i < arraySize; i++) {
            randfloat =(float)(Math.random());
            myFloatArray[i] = randfloat*100;
        }
    }
    
    static void printArray() {
        System.out.print("[ | ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(myFloatArray[i] +" | ");
        }
        System.out.println("]");
    }
    
    static void getReversedArray() {
        reversedArray = new float[arraySize];
        for (int i = arraySize-1; i >= 0; i--) {
            reversedArray[arraySize-(i+1)] = myFloatArray[i];
        }
    }
    
    static void printReversedArray() {
        System.out.print("[ | ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(reversedArray[i] +" | ");
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        getSize();
        getArray();
        printArray();
        getReversedArray();
        printReversedArray();
    }
}
