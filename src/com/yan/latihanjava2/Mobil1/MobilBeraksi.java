package com.yan.latihanjava2.Mobil1;

public class MobilBeraksi {
    public static void main (){
        //Create an object
        Mobil mobilku = new Mobil();

        //Call attribute and add value
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;


        System.out.println("Warna : " + mobilku.warna);
        System.out.println("Tahun Produksi : " + mobilku.tahunProduksi);
    }
}
