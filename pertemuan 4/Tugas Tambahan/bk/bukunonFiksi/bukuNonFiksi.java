/*File: bukuNonFiksi.java 16/03/2024
 * Penulis: Keisya Intan Nabila
 * NIM: 24060122130063
 * Deskripsi: representasi dari objek buku non fiksi, turunan kelas buku
 */
package bk.bukunonFiksi;

import bk.buku.Buku;

public class bukuNonFiksi extends Buku{
    private String subjek;
    private int jumlahHalaman;
    private double harga;

    public bukuNonFiksi(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getSubjek(){
        return subjek;
    }

    public int getJumlahHalaman(){
        return jumlahHalaman;
    }

    public double getHarga(){
        return harga;
    }

    public void setSubjek(String subjek){
        this.subjek = subjek;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void view(){
        System.out.println("\n-------BUKU NON FIKSI-------");
        System.out.println("Judul: "+ getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun terbit: " + getTahunTerbit());
        System.out.println("Subjek: " + getSubjek());
        System.out.println("Jumlah halaman: " + getJumlahHalaman());
        System.out.println("Harga: " + getHarga());
    }

}
