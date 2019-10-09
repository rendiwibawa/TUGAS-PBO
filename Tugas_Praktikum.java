package jobsheet.oop;

import java.util.Scanner;

public class Tugas_Praktikum {

    public static void main(String[] args) {
        Scanner ren = new Scanner(System.in);
        Tugas_Praktikum kal = new Tugas_Praktikum();
           boolean ulang=true;
         String jwb;
        int tgl,bln,thn,counter=0;//untuk mengulang program
         while(ulang){
        System.out.println("Silhkan pilih pengoprasian bangun \n 1.Menghitung luas bola\n 2.Menghitung luas Balok\n==================================");
        int pilih;
        pilih = ren.nextInt();
        switch (pilih) {
            case 1:
                kal.Bola("");
                break;
            case 2:
                kal.Balok("");
                break;
        }
 System.out.println("APAKAH ANDA INGIN MENGANTINYA (y/t)");
        jwb=ren.next();
         if(jwb.equalsIgnoreCase("t"))
            ulang=false;
        }counter++;
    }

    private void Bola(String iy) {
        double jari;
        double phi = 3.14;
        Scanner ren = new Scanner(System.in);
        System.out.println("===Menghitung luas permukaan BOLA===");
        System.out.print("massukan jari-jari :");
        jari = ren.nextByte();
        System.out.println("================================");
        System.out.println("Hasil dari luas permukaan BOLA\n" + ((4 * phi * jari)));
        System.out.println("================================");
    }

    private void Balok(String iy) {
        int p, l, t;
        Scanner ren = new Scanner(System.in);
        System.out.println("===Menghitung luas permukaan balok===");
        System.out.println("Nilai panjang balok :");
        p = ren.nextInt();
        System.out.println("Nilai panjang balok :");
        l = ren.nextInt();
        System.out.println("Nilai panjang balok :");
        t = ren.nextInt();
        System.out.println("=================================");
        System.out.println("Menghitung luas permukaan balok");
        System.out.println("=================================");
        System.out.println("Luas permukaan balok adalah :" + ((2 * p * l) + (2 * p * t) + (2 * l * t)));
        System.out.println("=================================\n");
    }
    
}
