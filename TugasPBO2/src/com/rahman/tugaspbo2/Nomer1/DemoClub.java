package com.rahman.tugaspbo2.Nomer1;

public class DemoClub {
    public static void main(String[] args) {

        // Inisiasi Objek
        Club club1 = new Club();
        Club club2 = new Club("Barcelona");
        Club club3 = new Club("Barcelona", "Fc Barcelona adalah club sepak bola yang bermain di liga spanyol");
        Club club4 = new Club("Barcelona", 1899, "Cam Nou");
        Club club5 = new Club("Barcelona", 1899, "Cam Nou", 5, "Fc Barcelona adalah club sepak bola yang bermain di liga spanyol");

        // Memanggil Method getTeam dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
