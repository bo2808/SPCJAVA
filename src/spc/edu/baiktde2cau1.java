/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class baiktde2cau1 {
    public static void main(String[] args) {
        System.out.println("bai kt de 2");
        Scanner sc = new Scanner (System.in);
        double s, r, v;
        System.out.println("nhap ban kin hinh cau:");
        r = sc.nextDouble();
        System.out.println("dien tich hinh cau:");
        s = sc.nextDouble();
        s = 4 * Math.PI * (r * r);
        System.out.println("the tich hinh cau:");
        v = 4/3 * Math.PI * (r * r * r);    
    }
}
 