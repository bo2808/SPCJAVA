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
public class bai4pheptinhcoban {
    public static void main(String[] args) {
        System.out.println("phep tinh co ban");
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so a");
        int a = sc.nextInt();
        System.out.println("Nhap so b");
        int b = sc.nextInt();
        int tong = a + b;
        System.out.println("Tong = " +  tong);
        System.out.println("Tong = " +  tong(a,b));
        int hieu = a- b;
        System.out.println(a + " - " + b + " = " + hieu);
        System.out.println(a + " - " + b + " = " + hieu(a,b));
         int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);
        System.out.println(a + " * " + b + " = " + tich(a,b));
         int thuong = a / b;
       //System.out.println(a + " / " + b + " = " + thuong);
        System.out.println(a + " / " + b + " = " + thuong(a,b));
    }
    
    private static int tong(int a, int b){
        return a+b;
    }
    private static int hieu(int a, int b){
        return a-b;
    }
     private static int tich(int a, int b){
        return a*b;
     }
     private static String thuong(int a, int b){
         if (b == 0) {
             return "khong the chia cho 0";
     } else {
             return Double.toString((double)a/b);
         }
     }
}
    

