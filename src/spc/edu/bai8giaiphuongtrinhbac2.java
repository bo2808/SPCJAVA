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
public class bai8giaiphuongtrinhbac2 {
    public static void main(String[] args) {
        System.out.println("chuong trinh giai phuong trinh bac2");
         Scanner sc = new Scanner (System.in);
         System.out.println("NHap he so a: ");
         int a = sc.nextInt();
        System.out.println("Nhap he so b: ");
        int b =  sc.nextInt();
        System.out.println("Nhap he so c: ");
        int c = sc.nextInt();
        // kiem tra a=0
        if (a == 0) {
            if (b == 0){
            System.out.println("phuong trinh vo nghiem");
        }else{
            System.out.println("phuong trinh co 1 nghiem x ="+ (-c / b));
        }
    }
    // cong thuc delta = b2 - 4ac
    double delta = b*b - 4*a*c;
    double x1;
    double x2;
    if (delta > 0){
    x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
    x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            
    }else if (delta == 0){
           x1 = -b / 2*a;
            System.out.println("nghiem kep x1 = x2" +x1);
            
} else{
            System.out.println("phuong trinh vo nghiem");
    
}
    }
}

