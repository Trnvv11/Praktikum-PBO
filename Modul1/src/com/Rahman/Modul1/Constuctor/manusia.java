package com.Rahman.Modul1.Constuctor;

public class manusia {
    private String nama;
    private int umur;

    //costructor 1 - tanpa paramater
    public manusia(){}

    //constructor 2
    public manusia(String nama) {
        this.nama = nama;
    }

    //constructor 3
    public manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //method
    public String getNama(){
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
}
