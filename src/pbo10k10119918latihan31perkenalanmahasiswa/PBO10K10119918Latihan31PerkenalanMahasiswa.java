/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan31perkenalanmahasiswa;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil perkenalan mahasiswa dengan menggunakan
 * sistem OOP
 *
 */

public class PBO10K10119918Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.nim = "10110269";
        mahasiswa.nama = "Rizki Adam Kurniawan";
        mahasiswa.perkenalkanDiri();
        
        mahasiswa.nim = "10110270";
        mahasiswa.nama = "Indra Tiola";
        mahasiswa.perkenalkanDiri();
        
        mahasiswa.nim = "10110271";
        mahasiswa.nama = "Robi Ransil Ganefi";
        mahasiswa.perkenalkanDiri();
        
        mahasiswa.nim = "10110269";
        mahasiswa.nama = "Muhammad Nur Awaludin";
        mahasiswa.perkenalkanDiri();
    }
    
}
