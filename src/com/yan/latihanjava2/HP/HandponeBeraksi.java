package com.yan.latihanjava2.HP;

public class HandponeBeraksi {
    public static void main(){
        //create an object
        Handphone handphone = new Handphone();

        //call attribute and add value
        handphone.hidupkan = "Handphone hidup ...";
        handphone.panggilan = "Kring kring kring ... Panggilan di Lakukan";
        handphone.sms = "Dung dung dung ... sms berhasil terkirim";
        handphone.matikan = "Handphone mati ...";

        //print method
        handphone.printHandphone();
    }
}
