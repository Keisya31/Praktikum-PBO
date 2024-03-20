/*BangunDatar.java 19 Maret 2024
 * Penulis: Keisya Intan Nabila
 * Deskripsi: kelas abstrak, berisi abstraksi bangund datar
 */
public abstract class BangunDatar {
    protected double luas;
    
    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}
