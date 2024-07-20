package database;
import DAO.NhanVienDAO;
import Model.NHANVIEN;
import java.sql.*;
import database.JDBC;
import java.util.ArrayList;

/**
 *
 * @author quanlong79
 */
public class test {
    public static void main(String[] args) {
        NhanVienDAO nvDAO = new NhanVienDAO();
        NHANVIEN nvParam = new NHANVIEN(); // Tạo một đối tượng NHANVIEN (thực tế có thể không cần thiết nếu không sử dụng trong truy vấn)
        ArrayList<NHANVIEN> nhanVienList = nvDAO.selectAll(nvParam);

        for (NHANVIEN nv : nhanVienList) {
            System.out.println("Mã NV: " + nv.getMaNV());
            System.out.println("Tên NV: " + nv.getTenNV());
            System.out.println("Giới Tính: " + nv.getGioiTinh());
            System.out.println("Ngày Sinh: " + nv.getNgaySinh());
            System.out.println("Địa Chỉ: " + nv.getDiaChi());
            System.out.println("SĐT: " + nv.getSdt());
            System.out.println("Email: " + nv.getEmail()); // In giá trị Email
            System.out.println("Lương: " + nv.getLuong());
            System.out.println("Mật Khẩu: " + nv.getPassword());
            System.out.println("---------------------------");
        }
    }
}