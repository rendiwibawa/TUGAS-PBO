package belajar_pbo;

import java.util.Scanner;

public class Belajar_PBO {
public static void main(String[] args) {
        Belajar_PBO barang = new Belajar_PBO();//membuat object
        
        boolean ulang=true;
         String jwb;
        int tgl,bln,thn,counter=0;//untuk mengulang program
         while(ulang){
             
        System.out.println("apa yang anda akan ketahui di ruang kesiswaan\n1.profil guru (Ana wahyuning)\n2.meja\n3.kursi\n4.komputer\n\n++SILAHKAN PILIH YANG AKAN ANDA KETAHUI ++");
        Scanner ren = new Scanner(System.in);
        int pilih;
        pilih = ren.nextInt();
        switch (pilih) {
            case 1:
                barang.profil("");break;
            case 2:
                barang.setMeja("");break;
            case 3:
                barang.setKursi("");break;
            case 4:
                barang.setKomputer("");break;
            case 5:
                barang.dispenser("");break;
            case 6:
                barang.setKomputer("");break;

            case 7: barang.setKomputer("");break;
         
        }         
       System.out.println("APAKAH ANDA INGIN MENGANTINYA (y/t)");
        jwb=ren.next();
         if(jwb.equalsIgnoreCase("t"))
            ulang=false;
        }counter++;
        
        
} 

private void dispenser(String brng) {
        brng = "1(Satu) ";
           System.out.println("=======================================================");
        System.out.println("jumlah meja di ruang kesiswaan ada " + brng+"  buah");
           System.out.println("=======================================================");
    }
 


    private void setMeja(String Meja) {
        Meja = "delapan buah 8 ";
        String merek="TRENDY";
        int pilih;
       Scanner ren= new Scanner (System.in);
        System.out.println("=======================================================");
        System.out.println("APA YANG AKAN ANDA INGIN TAHU TENTANG MEJA DI RUANG KESISIWAAAN\n 1.Jumlah meja\n 2.merek meja");
        pilih = ren.nextInt();
        if (pilih==1){
        System.out.println("jumlah meja di ruang kesiswaan ada " + Meja);}
        else{if (pilih==2){
            System.out.println("Merek meja di ruang kesiswaan adalah "+merek);
           System.out.println("=======================================================");
    }}}

    
    
    
    private void setKursi(String kursi) {
        kursi = "delapan belas buah 18";
        String merek="Olympic";
        int pilih;
        Scanner ren=new Scanner(System.in);
           System.out.println("=======================================================");
           System.out.println("APA YANG AKAN ANDA INGIN TAHU TENTANG KURSI DI RUANG KESISIWAAAN\n 1.Jumlah kursi\n 2.merek kursi");
        pilih = ren.nextInt();
        if (pilih==1){
        System.out.println("jumlah kursi di ruang kesiswaan ada " + kursi);}
        else{if (pilih==2){
            System.out.println("Merek kursi di ruang kesiswaan adalah "+merek);
        
           System.out.println("=======================================================");
    }}}
    
    
    
    
    private void setKomputer(String komputer) {
        komputer = "tujuh buah 7";
       String merek="Hp,Lenovo";
         int pilih;
        Scanner ren=new Scanner(System.in);
         System.out.println("=======================================================");
           System.out.println("APA YANG AKAN ANDA INGIN TAHU TENTANG KOMPUTER DI RUANG KESISIWAAAN\n 1.Jumlah komputer\n 2.merek komputer");
        pilih = ren.nextInt();
        if (pilih==1){
        System.out.println("jumlah komputer di ruang kesiswaan ada " + komputer);}
        else{if (pilih==2){
            System.out.println("Merek komputer di ruang kesiswaan adalah "+merek);
        
           System.out.println("=======================================================");
    }}}

    
    
    private void profil(String info){ 
            info ="Nama          : Anan Wahyuning Sholikhatin"
                + "\nLahir Tanggal : 26 Oktokber 1988(Jombang)"
                + "\nUmur          : 31(tiga puluh satu)"
                + "\nAlamat        : Puri bun asri H4 curung 7 Kepanjen"
                + "\nTugasnya di kesiswaan sebagai Staf admin";
            System.out.println("===========================================");
            System.out.println(info);
           System.out.println("===========================================");
           
   
}

}
    
    




