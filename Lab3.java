/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Liam O'Kelley
 */
import java.util.*;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int num = 0;
        
        System.out.println("Enter ten integers between 1 and 100, and I will tell you the smallest, the largest, and the average:");

        for (int i = 0; i < 10; i++) {
            num = scan.nextInt();
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }
        
        double average = sum / 10.0d;
        
        System.out.println("Your minimum number is: " + min);
        System.out.println("Your maximum number is: " + max);
        System.out.println("Your average is: " + average);
    }
}
