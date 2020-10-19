package com.rahman.modul2.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Monolog","Pamungkas");
        Lagu lagu2 = new Lagu("Evaluasi","Hindia");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
