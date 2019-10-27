/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6frommentor;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PiPrecision {

    static String precision;
    
    
    public static void getPrecision() {
        StringBuilder format = new StringBuilder();
        format = format.append("%.");
        System.out.println("Enter desired precision");
        Scanner in = new Scanner(System.in);
        format = format.append(in.nextInt());
        format = format.append("f");
        precision = format.toString();
    }
    
    public static void printPi() {
        System.out.println(String.format(precision, Math.PI));
    }
    
    public static void main(String[] args) {
        getPrecision();
        printPi();
    }
    
}
