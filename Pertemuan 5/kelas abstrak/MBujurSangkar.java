import java.util.Scanner;
/*BangunDatar.java 19 Maret 2024
 * Penulis: Keisya Intan Nabila
 * Deskripsi: kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 */

class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi Bujur Sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas Bujur Sangkar dengan Sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
}

//kesimpulan
//jika di bujur sangkar gaada implementasinya, maka tidak bisa dipanggil di mainnya. 
//karena bujur sangkar harus mengimplementasikan methode dari bangun datar yang berupa kelas abstract
