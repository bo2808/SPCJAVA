/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class bai15_jframe1 {
    public static void main(String[] args) {
        //Tạo một JFrame mới
        JFrame frame = new JFrame ("Ví dụ JFrame đơn giản. ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300); //kích thước của cửa sổ
        
        //Tạo một JPanel
        JPanel panel = new JPanel();
        
        //Tạo một nút
        JButton button = new JButton("Nhắn tôi!");
        
        //Thêm nút vào JPanel 
        panel.add(button);
        
        //Thêm JPanel vào JFrame
        frame.add(panel);
        
        // Hiển thị cửa sổ
        frame.setVisible(true);
        
    }
}
