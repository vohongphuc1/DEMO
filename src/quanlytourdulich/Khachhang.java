/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlytourdulich;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Khachhang {
    private String hoTen;     // Họ và tên người tham gia
    private Double sdt;  // Loại tour (ví dụ: trong nước, quốc tế)
    private String diachi; 
    private Double cccd;

    public Khachhang(String hoTen, Double sdt, String diachi, Double cccd) {
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.diachi = diachi;
        this.cccd = cccd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getSdt() {
        return sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public Double getCccd() {
        return cccd;
    }
    // === Ghi danh sách khách hàng vào file ===
    public static void luuFile(List<Khachhang> danhSach, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Khachhang kh : danhSach) {
                String line = kh.getHoTen() + "," + kh.getSdt() + "," + kh.getDiachi() + "," + kh.getCccd();
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Đã lưu file thành công!");
        } catch (IOException e) {
            System.err.println("Lỗi khi lưu file: " + e.getMessage());
        }
    }

    // === Đọc danh sách khách hàng từ file ===
    public static List<Khachhang> docFile(String filename) {
        List<Khachhang> danhSach = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String hoTen = parts[0];
                    double sdt = Double.parseDouble(parts[1]);
                    String diachi = parts[2];
                    Double cccd = Double.parseDouble(parts[3]);
                    Khachhang kh = new Khachhang(hoTen, sdt, diachi, cccd);
                    danhSach.add(kh);
                }
            }
            System.out.println("Đọc file thành công!");
        } catch (IOException | NumberFormatException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
        return danhSach;
    }
}

