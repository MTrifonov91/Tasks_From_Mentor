/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staircase;

/**
 *
 * @author User
 */
public class Staircase {
    int numberOfStairs;

    public Staircase(int numberOfStairs) {
        this.numberOfStairs = numberOfStairs;
    }
    
    public void drawStaircase() {
        for (int i = 0; i < numberOfStairs; i++) {
            for (int j = 0; j < (i+1); j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    
    public void drawEmptyStaircase() {
        for (int i = 0; i < numberOfStairs; i++) {
            for (int j = 0; j < (i+1); j++) {
                if (i < (numberOfStairs-1)) {
                    if (j == 0 || j == i) {
                    System.out.print("#");
                    }
                    else {
                    System.out.print(" ");
                }
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }
}
