/*File: MPoligon.java 16/03/2024
 * Penulis: Keisya Intan Nabila
 * Deskripsi: driver class untuk poligon, persegi panjang, dan Segitiga
  */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        System.out.println("\n-----PERSEGI PANJANG-----");
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: "+persegi.hitungLuas()+"");

        System.out.println("\n-----SEGITIGA-----");
        Segitiga segitiga = new Segitiga(7, 10, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga: "+segitiga.hitungLuas()+"\n");
    }

    
}
