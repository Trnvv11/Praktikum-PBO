package com.Rahman.Modul1.Constuctor;

public class DemoManusia {

    public static void main(String[] args) {
        manusia arraymanusia[] = new manusia[3];

        manusia manusia1 = new manusia();
        manusia1.setNama("Boruto");
        manusia1.setUmur(12);

        manusia manusia2 = new manusia("Sarada",12);
        manusia manusia3 = new manusia("Mitsuki",12);

        arraymanusia[0] = manusia1;
        arraymanusia[1] = manusia2;
        arraymanusia[2] = manusia3;

        for (manusia x : arraymanusia){
            System.out.println("Character ");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
        }
    }
}
