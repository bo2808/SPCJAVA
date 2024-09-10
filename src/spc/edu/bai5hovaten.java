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
public class bai5hovaten {
    public static void main(String[] args) {
        System.out.println("chuong trinh quan ly sinh vien");
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap ho va ten: ");
        //String hoten = sc.next();
        String hoten = sc.nextLine();
        
        System.out.println("Nhap nam sinh cua ban: ");
        int namsinh = sc.nextInt();
        
        System.out.println("Chao ban" + hoten);
        System.out.println("Tuoi cua ban la " + (2024-namsinh));
    }
}
