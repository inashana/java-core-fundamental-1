/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi01;

/**
 *
 * @author ASUS
 */
public class Masakan {
    String jenisHewan;
    String bumbu;
    int dada;
    int paha;
    int sayap;
    int ketebalan;
    int ceker;
    int kepala;
    int harga;
    int quantity;
    int diskon;
    int hargaUpdate;
    boolean statusSiapJual; 
    
    
    public static void main(String[] args) {
        
        Masakan MasakanPertama = new Masakan();
        MasakanPertama.persiapan();
        MasakanPertama.mulaiMemasak();
        MasakanPertama.bukaToko();
    }
    
    // asumsikan ada 3 proses
    // 1.persiapan
    // 2.mulai memasak
    // 3.buka toko
    
    public void persiapan(){
        // mulai nambah quantity ayam naik ke nilai 100
        // dan bumbunya mulai berisi komplit
        // pahanya quantity * 2
        // kepalanya = quantity ayam
        // harga satuan senilai 29000
        harga = 29000;
        bumbu = "komplit";
        quantity = 100;
        paha = quantity * 2;
        dada = quantity;
        kepala = quantity;
        sayap = quantity * 2;
        ceker = quantity * 2;
        System.out.println("System Makanan");
        System.out.println("==============");
        System.out.println("Mulai persiapan.");
        System.out.println("Harga : " + harga);
        System.out.println("Bumbu : " + bumbu);
        System.out.println("Quantity : " + quantity);
        System.out.println("Paha : " + quantity*2);
        System.out.println("Dada : " + dada);
        System.out.println("Kepala : " + quantity);
        System.out.println("Sayap : " + quantity*2);
        System.out.println("Ceker : " + quantity*2);
        
               
        
    }
    
    public void mulaiMemasak(){
        // bumbu menjadi matang
        // harga tetap
        // quantity tetap
        // ketebalan menyusut -10
        // tampilan dalam variabel tersusun
        // gunakan sout
        ketebalan -= 10;
        bumbu = "matang";
        System.out.println("");
        System.out.println("Saat mulai Memasak");
        System.out.println("==================");
        System.out.println("Bumbu : " + bumbu);
        System.out.println("Harga : " + harga);
        System.out.println("Quantity : " + quantity);
        System.out.println("Ketebalan : " + ketebalan);
        
     
    }
    
 
}
