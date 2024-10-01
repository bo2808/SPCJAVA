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
class SinhVien {

    private String ten;
    private double diem;

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getten() {
        return ten;
    }

    public double getdiem() {
        return diem;
    }
}

public class bai21_SapXep {

    public static void main(String[] args) {
        String ten;
        double diem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = Integer.parseInt(sc.nextLine());
        SinhVien sv[] = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            sv[i] = new SinhVien();
            System.out.println("nhap ten sinh vien:");
            ten = sc.nextLine();
            sv[i].setTen(ten);
            System.out.println("nhap diem:");
            diem = sc.nextDouble();
            sv[i].setDiem(diem);
        }
        for (int j = 0; j < n; j++) {
            System.out.println("ho va ten sinh vien:" + sv[j].getten());
            System.out.println("diem sinh vien:" + sv[j].getdiem());
            if (sv[j].getdiem() < 5) {
                System.out.println("Hoc luc yeu");
            } else if (sv[j].getdiem() <= 6) {
                System.out.println("Hoc luc trung binh");
            } else if (sv[j].getdiem() < 8) {
                System.out.println("Hoc luc kha");
            } else {
                System.out.println("Hoc luc gioi");
            }
        }
        for (int x = 0; x < n; x++) {
            for (int y = x + 1; y < n; y++) {
                if (sv[x].getdiem() < sv[y].getdiem()) {
                    SinhVien tam = new SinhVien();
                    tam = sv[x];
                    sv[x] = sv[y];
                    sv[y] = tam;
                }
            }
        }
    }
}
