package com.datenow;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menampilkan tanggal berdasarkan lokasi dan waktu sekarang
 */

public class Main {
    static Date date = new Date();
    static Locale lokal = Locale.forLanguageTag("id");
    static SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", lokal);

    private static void tampilWaktu(){
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
 
    public static void main(String[] args) { tampilWaktu();}
}
