package com.Rahman.Modul1.Pass;

import java.awt.event.TextEvent;

public class TestPass {
    int nomor1, nomor2;

    public TestPass(int nomor1, int nomor2) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }
    //pass by value
    void calculate (int m, int n){
        m = m * 10;
        n = n / 2;
    }
    //pass by reference
    void calculate (TestPass passed){
        passed.nomor1 = passed.nomor1 * 10;
        passed.nomor2 = passed.nomor2 / 2;
    }
}


