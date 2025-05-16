package quanlytourdulich;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tour {
    private String hoTen;     // Họ và tên người tham gia
    private String loaiTour;  // Loại tour (ví dụ: trong nước, quốc tế)
    private double gia;       // Giá tour

    public Tour(String hoTen, String loaiTour, double gia) {
        this.hoTen = hoTen;
        this.loaiTour = loaiTour;
        this.gia = gia;
    }
    // Getter
    public String getHoTen() {
        return hoTen;
    }

    public String getLoaiTour() {
        return loaiTour;
    }

    public double getGia() {
        return gia;
    }

    // Setter
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLoaiTour(String loaiTour) {
        this.loaiTour = loaiTour;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    // Lưu danh sách Tour vào file
    public static void luuFile(List<Tour> listTours, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Tour t : listTours) {
                String line = t.getHoTen() + "," + t.getLoaiTour() + "," + t.getGia();
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Lưu file thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đọc danh sách Tour từ file
    public static List<Tour> docFile(String filename) {
        List<Tour> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Tour t = new Tour(parts[0], parts[1], Double.parseDouble(parts[2]));
                    list.add(t);
                }
            }
            System.out.println("Đọc file thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
