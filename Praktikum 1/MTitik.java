public class MTitik{
    public static void main(String[] args){
       
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        Titik t3 = new Titik(5, 6);

        System.out.println("Jumlah Objek Titik : " + Titik.getCounterTitik());
        System.out.println("L1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("L2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("L3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
    }
    
}
