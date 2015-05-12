package com.company;
/**
 * Created by ASUS on 5/12/2015.
 */
public class tes_kendaraan
{
    public static void main(String[] args)
    {
        Mobil porsche = new Mobil(200, 5000, 2, 4);
        porsche.Cetakspesifikasi();
        porsche.KecepatanMax(100);
        porsche.KecepatanMax(180);
    }
}

