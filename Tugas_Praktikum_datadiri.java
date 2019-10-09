package jobsheet.oop;
import java.util.Scanner;
public class Tugas_Praktikum_datadiri {
    public static void main(String[] args) {
        
    
    Tugas_Praktikum_datadiri data=new Tugas_Praktikum_datadiri();
    data.Nama("");
    data.Nisn("");
    data.TempatLahir("");
    data.TanggalLahir("");
    data.JenisKelamin("");
    data.Alamat("");
    data.Motto("");
}

    
    private void Nama(String nama) {
        nama="Rendi Prayata Wibawa";
        System.out.println("Nama             :"+nama);
        
    }

    private void Nisn(String Nisn) {
        Nisn="6316/2579.065";
        System.out.println("Nisn             :"+Nisn);
       
    }

    private void TempatLahir(String Tl) {
        Tl="Nganjuk";
        System.out.println("Tempat lahir     :"+Tl);
       
    }

    private void TanggalLahir(String tgl) {
        tgl="24 April 2003";
        System.out.println("Tanggal lahir    :"+tgl);
       
    }

    private void JenisKelamin(String jk) {
        jk="Laki-Laki";
        System.out.println("Jenis kelamin    :"+jk);
       
    }

    private void Alamat(String alm) {
        alm="Jl.Segara anak G7A2";
        System.out.println("Alamat di Malang :"
        +alm);
       
    }

    private void Motto(String mt) {
        mt="manada wajada(siapa yang bersungguh-sungguh maka ia akan mendapatkan nya)";
        System.out.println("Motto Hidup      :"+mt);
       
    }
}