package com.firstapp.quyen.advancedlistview;

public class TraiCay {
    String ten;
    String Mota;
    int Hinh;


    public TraiCay(String ten, String mota, int hinh) {
        this.ten = ten;
        Mota = mota;
        Hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHinh() {
        return Hinh;
    }

    public String getMota() {
        return Mota;
    }
}
