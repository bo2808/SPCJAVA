/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class bangcuuchuong {
    public static void main(String[] args) {
        System.out.println("bang cu chuong");
        int i,j;
        for( i =1;i<=10;i++ )
        {
            for (j = 2; j<=10;j++)
            {
                System.out.printf("%d x %d = %-4d\t", j,i,j*i);
                
            }
            System.out.println(); 
        }
    }
}
