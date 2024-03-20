/*File: bukuFiksi.java 16/03/2024
 * Penulis: Keisya Intan Nabila
 * NIM: 24060122130063
 * Deskripsi: representasi dari objek buku fiksi, turunan kelas buku
 */
package bk.bukuFiksi;

import bk.buku.Buku;

public class bukuFiksi extends Buku {
    private String genre;
    private int jumlahHalaman;
    private double harga;

    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this. harga = harga;
    }

    public String getGenre(){
        return genre;
    }

    public int getJumlahHalaman(){
        return jumlahHalaman;
    }

    public double getHarga(){
        return harga;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void view(){
        System.out.println("\n-------BUKU FIKSI-------");
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun terbit: " + getTahunTerbit());
        System.out.println("Genre: " + getGenre());
        System.out.println("Jumlah halaman: " + getJumlahHalaman());
        System.out.println("Harga: " + getHarga());
    }
}
