/*Nama: Keisya Intan Nabila
 * NIM: 24060122130063
 * Lab: B2
 * Tanggal: Selasa, 27 Maret 2024
 * Program: Membuat main program untuk Titik
 */
public class MTitik{
    public static void main(String[] args){

        // Titik T1 dan jarak pusat titik T1
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);
        System.out.println("T1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("Jarak pusat titik T1 : " + t1.getJarakPusat());
        
        // Titik T2 dan jarak pusat titik T2
        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);
        System.out.println("\nT2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("Jarak pusat titik T2 : " + t2.getJarakPusat());
        
        // Titik T3 dan jarak pusat titik T3
        Titik t3 = new Titik(5, 6);
        System.out.println("\nT3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        System.out.println("Jarak pusat titik T3 : " + t3.getJarakPusat());

        System.out.println("Jumlah Objek Titik : " + Titik.getCounterTitik());

        System.out.println("\nRefleksi titik T1 (berlanjut dari titik hasil refleksi sebelumnya)");
        //Refleksi Sumbu X
        t1.refleksiX();
        System.out.println("Refleksi sumbu X dari Titik T1 (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");

        //Refleksi Sumbu Y
        t1.refleksiY();
        System.out.println("Refleksi sumbu Y dari Titik T1 (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");

        System.out.println("\nRefleksi titik T2 (tanpa berlanjut dari refleksi sebelumnya dan tidak mengubah titik aslinya)");
        //Refleksi sumbu X tanpa mengubah titik aslinya
        Titik tRefleksiX = t2.getRefleksiX();
        System.out.println("Refleksi sumbu X tRefleksiX (" + tRefleksiX.getAbsis() + "," + tRefleksiX.getOrdinat() + ")");

        //Refleksi sumbu Y tanpa mengubah titik aslinya
        Titik tRefleksiY = t2.getRefleksiY();
        System.out.println("Refleksi sumbu Y tRefleksiY (" + tRefleksiY.getAbsis() + "," + tRefleksiY.getOrdinat() + ")");
    }
    //Kesimpulan dari hasil percobaan yang telah dilakukan dituangkan dalam poin-poin berikut:
    /*
      (1) Dipercobaan dan eksperimen pembuatan titik di program java sedikit berbeda dan
        butuh penyesuaian kembali dibandingkan dengan bahasa yang sebelumnya telah saya pelajari
        yaitu C/C++ dan Python. 
      (2) Method - method yang ditambahkan di pertemuan ke 2 ini selain setAbsis, setOrdinat,
        getAbsis, getOrdinat, dan getCounterTitik yaitu getJarakPusat, refleksiX, refleksiY,
        getRefleksiX, dan getRefleksiY. 
      (3) Method getJarakPusat untuk menghitung jarak dari titik yang telah dibuat terhadap titik pusat (0,0)
      (4) terkait dengan refleksi terhadap sumbu x dan sumbu y terdapat 2 jenis output yang dihasilkan,
        yaitu pertama untuk refleksi baik terhadap sumbu x dan y yang mengubah titik aslinya.
        Karena saat melakukan refleksi pertama terhadap sumbu x, kemudian hasil refleksi dari sumbu x
        direfleksikan kembali terhadap sumbu y. Sehingga, nilai titik awal menjadi hasil akhir dari hasil refleksi
        terhadap sumbu y.
        contoh di program titik T1 (1, 2), direfleksikan terhadap sumbu x menjadi T1 (1, -2)
        direfleksikan terhadap sumbu y menjadi T1 (-1, -2). Sehingga nilai titik T1 sekarang adalah (-1, -2)
     (5) Output kedua dari hasil refleksi adalah dengan tidak mengubah nilai titik aslinya, karena
        saat melakukan refleksi pertama terhadap sumbu x, kemudian saat melakukan refleksi kedua terhadap sumbu y
        itu dilakukan dari titik awal lagi, bukan dari titik hasil refleksi terhadap sumbu x sebelumnya. Sehingga nilai titik awal nya tetap, tidak berubah.
        contoh di program titik T2 (3, 4), direfleksikan terhadap sumbu x menajadi t2 (3, -4), kemudian
        saat akan merefleksikan terhadap sumbu y, titik nya dari titik awal lagi sehingga T2 menjadi (-3, 4). 
        Maka titik aslinya yaitu T2 (3, 4) tetap bernilai sama.
     (6) Kemudian terkait dengan akses modifier itu sendiri, ketika saya mencoba untuk mengubah settinganya dari
        public menjadi private terhadap method nya, method tersebut tidak bisa dipanggil di class yg berbeda, dan itu
        merupakan konsekuensi yang jelas tekait perubahan dari public ke private. Karena modifier private
        itu hanya bisa diakses oleh class itu sendiri (class yang sama).
    
     
      
     */



}
