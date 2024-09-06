package sinhvien;

public class main {

    public static void main(String[] args) {
        Sinhvien t = new Sinhvien("123", "linh", 3.7);
        System.out.println(t.getHoTen() + " " + t.getMaSinhVien() + " " + t.getGpa());
    }
}
