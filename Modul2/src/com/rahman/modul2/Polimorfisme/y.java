package com.rahman.modul2.Polimorfisme;

public class y extends x {
    @Override
    public void getValue(String value) {
        super.getValue(value);
        System.out.println("value kelas y : " + value);
    }
}
