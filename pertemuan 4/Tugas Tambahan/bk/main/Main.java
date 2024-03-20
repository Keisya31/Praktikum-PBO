/*File: main.java 16/03/2024
 * Penulis: Keisya Intan Nabila
 * NIM: 24060122130063
 * Deskripsi: driver class
 */
package bk.main;

import bk.buku.*;
import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;


public class Main {
    public static void main(String[] args){
        bukuFiksi bukuF1 = new bukuFiksi("Re: dan PeRempuan", "Maman Suherman", "2022", "Romance Biography", 330, 90000);
        bukuF1.view();
        
        bukuNovel bukuF2 = new bukuNovel("Little Women", "Louisa May Alcott", "2020", "Romance", 378, 75000);
        bukuF2.view();

        bukuNonFiksi bukuNF1 = new bukuNonFiksi("How To Have A Beautiful Mind","Edward De Bono", "2023","Motivation", 254, 88000 );
        bukuNF1.view();

        bukuAkademik bukuNF2 = new bukuAkademik("Diktat Kuliah Dasar Pemrograman","Inggriani Liem", "2008","College", 127, 40000 );
        bukuNF2.view();
    }
}
