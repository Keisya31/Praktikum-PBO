/*Nama: Keisya Intan Nabila
 * NIM: 24060122130063
 * Lab: B2
 * Tanggal: Jumat, 01 Maret 2024
 * Program: Membuat body program untuk Prisma Segitiga
 */
public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggiPrisma){
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public double volumePrisma(){
        return alas.hitungLuas() * tinggiPrisma;
    }

    public double luasPermukaanPrisma(){
        return (2 * alas.hitungLuas()) + ((alas.getAlas() + alas.getAlas() + alas.getAlas()) * tinggiPrisma); 
    }



}
