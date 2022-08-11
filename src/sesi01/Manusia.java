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
public class Manusia {
    String nama;
    int kepala;
    int badan;
    int tangan;
    int kaki;
    boolean siap;
    int nyawa;
    int experience;
    int level;
    
    public static void main(String[] args) {
        // untuk memanggil manusia kita buat
        // variabel object nya
        
        Manusia superHero = new Manusia ();
        superHero.persiapan();
        superHero.berlari();
        superHero.berlari();
        superHero.melompat();
    }
    
    public void persiapan(){
        nyawa = 9;
        experience = 0;
        level = 1;
        System.out.println("persiapan pertama kali...");
        System.out.println("=========================");
        System.out.println("Nilai awal");
        System.out.println("Nyawa : " + nyawa);
        System.out.println("Exp : " + experience);
        System.out.println("Level : + " + level);
        System.out.println("=========================");
        
    }
            
    public void berlari(){
        experience += 10;
        System.out.println("Mulai berlari Exp : " + experience);
    }
    
    public void melompat (){
        experience += 5;
        System.out.println("Melompat Exp : " + experience);
    }
    
}

