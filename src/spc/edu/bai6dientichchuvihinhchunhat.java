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
public class bai6dientichchuvihinhchunhat {
    public static void main(String[] args) {
        System.out.println("tinh dien tich chu vi hinh chu nhat");
        double chieudai , chieurong , chuvi , dientich;
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap chieu dai ");
        chieudai = sc.nextDouble();
        System.out.print("Nhap chieu rong ");
        chieurong = sc.nextDouble();
        chuvi= (chieudai + chieurong) *2;
        System.out.println("Chu vi hinh chu nhat = " + chuvi);
        dientich= chieudai * chieurong;
        System.out.println("Dien tich hinh chu nhat = "+ dientich);
    }
    
}
