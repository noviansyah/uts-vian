package com.company;

/**
 * Created by ASUS on 5/12/2015.
 */class Kendaraan {
    public int KecepatanMax;
    public int Berat;
    public int Kapasitas;

    public Kendaraan(){
        KecepatanMax= 20;
        System.out.println("Kecepatan MaxKendaraan : "+KecepatanMax);
    }
}

class Mobil extends Kendaraan {
    public int JumlahRoda;
    public Mobil(int h, int i, int j, int k){
        KecepatanMax=h;
        Berat =i;
        Kapasitas =j;
        JumlahRoda = k;
    }
    public void Cetakspesifikasi(){
        System.out.println("Kecepatan Max Mobil :"+ KecepatanMax);
        System.out.println("Berat Mobil :"+ Berat);
        System.out.println("Kapasitas Power :"+ Kapasitas);
        System.out.println("Jumlah Roda :"+ JumlahRoda);
    }
public void KecepatanMax (int p){
KecepatanMax = p;
    System.out.println("Mobil dijalankan dengan kecepatan :" + KecepatanMax);
}
}
