/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import javax.swing.SpringLayout;

/**
 *
 * @author Administrator
 */
public class baiktde2cau2 {

    public static void main(String[] args) {
        System.out.println("10 so dau tien o day so fibonacci: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if (n < 0) {
            return -1;
        } else if (n == 0 | | n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
            
        }
        return fn;
    }
}
