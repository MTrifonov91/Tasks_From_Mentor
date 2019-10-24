/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Palindrome {
    static String input;
    static String reversedInput;
    
    static void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your word");
        input = in.next();
    }
    
    static void reverseInput() {
        StringBuilder data = new StringBuilder();
        data = data.append(input);
        data = data.reverse();
        reversedInput = data.toString();
    }
    
    static void compare() {
        if (input.equalsIgnoreCase(reversedInput)) {
            System.out.println(input + " is a Palindrome");
    }
        else {
            System.out.println(input + " is not a Palindrome");
        }
    }
    
    public static void main(String[] args) {
        getInput();
        reverseInput();
        compare();
    }
}
