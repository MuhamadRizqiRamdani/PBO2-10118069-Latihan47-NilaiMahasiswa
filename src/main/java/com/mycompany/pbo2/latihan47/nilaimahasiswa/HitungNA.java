/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan47.nilaimahasiswa;

/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : Nilai Mahasiswa
 */
public class HitungNA {
    private final double quiz, uts, uas;
    private double na;
    
    public HitungNA(double quiz, double uts, double uas){
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }
    
    private double hitungNilaiAkhir(){
        return (0.2*quiz) + (0.3*uts) + (0.5*uas);
    }
    
    private String ind(double na){
        String index;
        if (na >= 80 && na <= 100) index = "A";
        else if (na >= 68 && na < 80) index = "B";
        else if (na >= 56 && na < 68) index = "C";
        else if (na >= 45 && na < 56) index = "D";
        else index = "E";
        return index;
    }
    
    private String ket(String ind){
        String keterangan;
            switch(ind){
                case "A" : keterangan = "Sangat Baik"; break;
                case "B" : keterangan = "Baik"; break;
                case "C" : keterangan = "Cukup"; break;
                case "D" : keterangan = "Kurang"; break;
                default :  keterangan = "Sangat Kurang"; break;
            } 
        return keterangan;
    }
    
    public void tampilNa(){
        na = hitungNilaiAkhir();
        
        System.out.println("QUIZ\t\t = " + quiz);
        System.out.println("UTS\t\t = " + uts);
        System.out.println("UAS\t\t = " + uas);
        System.out.println("\nNilai Akhir = " + na);
        System.out.println("\nIndex = " + ind(na));
        System.out.println("Keterangan = " + ket(ind(na)));
        
    }
}
