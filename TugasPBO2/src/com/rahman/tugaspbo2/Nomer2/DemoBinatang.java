package com.rahman.tugaspbo2.Nomer2;

public class DemoBinatang {
    public static void main(String[] args) {

        // Inisiasi Objek Burung
        Burung burung = new Burung();
        burung.nama = "Burung Kaka Tua";
        burung.makan = "biji-bijian";
        burung.tidur = "Burung Kaka Tua tidur di malam hari";
        burung.terbang = "Burung Kaka Tua Terbang Menggunakan Sayap";

        // Memanggil Method
        System.out.println("\t\t\t***** BURUNG *****");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        // Inisiasi Objek Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Paus";
        ikan.makan = "Ikan Paus Makan plankton";
        ikan.tidur = "Ikan Paus Tidur Pada Malam Hari";
        ikan.berenang = "Ikan Paus Berenang Menggunakan Sirip";

        System.out.println();

        System.out.println("\t\t\t***** IKAN *****");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        // Inisiasi Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing Persia";
        kucing.makan = "Kucing Persia Whiskas";
        kucing.tidur = "Kucing Persia Tidur Pada Malam Hari";
        kucing.meong = "Kucing Persia Meong Saat Musim Kawin";

        System.out.println("\t\t\t***** KUCING *****");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();
    }
}
