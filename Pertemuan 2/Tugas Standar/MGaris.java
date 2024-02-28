/*Nama: Keisya Intan Nabila
 * NIM: 24060122130063
 * Lab: B2
 * Tanggal: Selasa, 27 Maret 2024
 * Program: Membuat main program untuk Garis
 */
public class MGaris {
    public static void main(String[] args){
        Titik t1 = new Titik(3, 9);
        Titik t2 = new Titik(5, 6);

        Garis G = new Garis(t1, t2);

        Titik tAwal = G.getTitikAwal();
        Titik tAkhir = G.getTitikAkhir();

        System.out.println("Titik awal (" + tAwal.getAbsis() + ", " + tAwal.getOrdinat() + ")");
        System.out.println("Titik AKhir (" + tAkhir.getAbsis() + ", " + tAkhir.getOrdinat() + ")");

        System.out.println("\nPanjang garis G yaitu: " + G.getPanjang());
        System.out.println("Gradien garis G yaitu: " + G.getGradien());

        Garis GrefleksiY = G.getRefleksiY();
        Titik tAwalRefleksiY = GrefleksiY.getTitikAwal();
        Titik tAkhirRefleksiY = GrefleksiY.getTitikAkhir();

        System.out.println("\nRefleksi garis G terhadap sumbu Y, menjadi");
        System.out.println("Titik awal (" + tAwalRefleksiY.getAbsis() + ", " + tAwalRefleksiY.getOrdinat() + ")");
        System.out.println("Titik akhir (" + tAkhirRefleksiY.getAbsis() + ", " + tAkhirRefleksiY.getOrdinat() + ")");

        System.out.println("\nGaris G tegak lurus dengan garis GrefleksiY = " + G.isTegakLurus(GrefleksiY) + "\n");
    }
}
