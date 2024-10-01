/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class baiktde1cau1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String input;

        // Nhập dữ liệu từ bàn phím
        System.out.println("Nhap so, nhap 'stop' de dung:");
        while (true) {
            input = Scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so hop le hoac 'stop' đe dung.");
            }
        }

        // Tính toán và xuất kết quả
        if (!numbers.isEmpty()) {
            int max = numbers.get(0);
            int min = numbers.get(0);
            int sum = 0;

            for (int num : numbers) {
                if (num > max) max = num;
                if (num < min) min = num;
                sum += num;
            }

            double avg = (double) sum / numbers.size();

            System.out.println("So lon nhat: " + max);
            System.out.println("So nho nhat: " + min);
            System.out.println("Tong day so da nhap: " + sum);
            System.out.println("Trung binh day so da nhap: " + avg);
        } else {
            System.out.println("Khong co so nao duoc nhap.");
        }

        Scanner.close();
    }
}