/*Nama: Keisya Intan Nabila
 * NIM: 24060122130063
 * Lab: B2
 * Tanggal: Jumat, 01 Maret 2024
 * Program: Membuat body program untuk Segitiga
 */
public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga (double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggiSegitiga(){
        return tinggi;
    }

    public double hitungLuas(){
        return 0.5 * getAlas() * getTinggiSegitiga();
    }

    public double getSisiMiring(){
        return  Math.sqrt(Math.pow(getAlas()/2, 2) + Math.pow(getTinggiSegitiga(),2));
    }

}
