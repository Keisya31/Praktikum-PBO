/*File: bukuNovel.java 16/03/2024
 * Penulis: Keisya Intan Nabila
 * NIM: 24060122130063
 * Deskripsi: representasi dari objek buku novel, turunan kelas buku fiksi
 */
package bk.bukuFiksi;

import bk.bukuFiksi.bukuFiksi;

public class bukuNovel extends bukuFiksi {
    public bukuNovel(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, genre, jumlahHalaman, harga);
    }                                                                                            
}
