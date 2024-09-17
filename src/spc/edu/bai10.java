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
public class bai10 {
    public static void main(String[] args) {
        System.out.println("tinhluongvathue");
        double luong , thuong , thue,tong;
         Scanner sc = new Scanner (System.in);
         System.out.println("Nhap luong : ");
         luong = sc.nextDouble();
         System.out.println("Nhap thuong : ");
         thuong = sc.nextDouble();
         System.out.println("luong : " + luong);
         System.out.println("thuong : " + thuong);
         tong=(luong+thuong);
         if (tong <9 ){
             System.out.println("thue : 0%");
         }
         else if (tong<  9)
         {
             
             System.out.println("thue 10%:" + tong*10/100);
             
             
         }   
         else if (tong<= 15)
         {
             
             System.out.println("thue 15%: " + tong*15/100);
         }
         else if (tong<=30)
         {
             thue=tong*0.2;
             System.out.println("thue 20%: " + tong*20/100);
         }
         
         
         
         
        
        
    }
    
}
