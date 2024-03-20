/*MLingkaran.java 19 Maret 2024
 * Penulis: Keisya Intan Nabila
 * Deskripsi: Implementasi cara menghitung luas lingkaran
 */
import java.util.Scanner;
public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkaran: ");
        Lingkaran l = new Lingkaran(scan.nextDouble());
        System.out.println("Luas Lingkaran: "+l.hitungLuas());
    }
}
