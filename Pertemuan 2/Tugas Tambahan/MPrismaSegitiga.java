/*Nama: Keisya Intan Nabila
 * NIM: 24060122130063
 * Lab: B2
 * Tanggal: Jumat, 01 Maret 2024
 * Program: Membuat main program untuk Prisma Segitiga
 */
public class MPrismaSegitiga {
    public static void main (String[] args){
        Segitiga s1 = new Segitiga(3, 4);
        PrismaSegitiga ps1 = new PrismaSegitiga(s1, 5);
        System.out.println("\n-----Menghitung luas permukaan prisma segitiga dan volume prisma-----");
        System.out.println("Luas permukaan: " + ps1.luasPermukaanPrisma());
        System.out.println(("Volume: " + ps1.volumePrisma()) + "\n");


    }
}
