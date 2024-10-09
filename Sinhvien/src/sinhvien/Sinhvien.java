package sinhvien;

public class Sinhvien {

    private String maSinhVien;
    private String hoTen;
    private double gpa;
    private static int count = 0;

//    Sinhvien() {
//        System.out.println("Ham tao khong co tham so ");
//
//    }
    Sinhvien(String maSinhVien, String hoTen, double gpa) {
        ++count;
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.gpa = gpa;
    }

//    public void display() {
//        System.out.println(this.maSinhVien + " " + this.hoTen + " " + this.gpa);
//    }
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getGpa() {
        return gpa;
    }
}
