/*File: bukuAlademik.java 16/03/2024
 * Penulis: Keisya Intan Nabila
 * NIM: 24060122130063
 * Deskripsi: representasi dari objek buku akademik, turunan kelas buku non fiksi
 */
package bk.bukunonFiksi;

import bk.bukunonFiksi.bukuNonFiksi;

public class bukuAkademik extends bukuNonFiksi{
    public bukuAkademik(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, subjek, jumlahHalaman, harga);
    }
}
