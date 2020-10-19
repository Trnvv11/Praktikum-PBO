package com.Rahman.Modul1.Object;

    //class main / demo class
    public class obyek {
        public static void main(String[] args) {
            //deklarasi objek tanpa parameter
            Mahasiswa mahasiswatanpa = new Mahasiswa();

            mahasiswatanpa.setNama("Rahman");
            mahasiswatanpa.setNim(19104051);

            System.out.println("Mahasiswa 1");
            System.out.println("Nama\t : " + mahasiswatanpa.getNama());
            System.out.println("Nim\t : " + mahasiswatanpa.getNim());

            //deklarasi mahasiswa dengan parameter
            Mahasiswa mahasiswa = new Mahasiswa("Trinova",19104151);
            System.out.println("Mahasiswa 2");
            System.out.println("Nama\t : " + mahasiswa.getNama());
            System.out.println("Nim\t : " + mahasiswa.getNim());

        }
}
