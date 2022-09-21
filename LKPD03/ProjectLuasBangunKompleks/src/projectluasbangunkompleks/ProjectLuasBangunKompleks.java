/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author hasna.nrlzt
 */
public class ProjectLuasBangunKompleks {

    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.s = 42;
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.r = 21;
        Lingkaran lingkaran2 = new Lingkaran();
        lingkaran2.r = 14;
        Lingkaran lingkaran3 = new Lingkaran();
        lingkaran3.r = 7;

        // menghitung luas dengan l =  luas 
        double lPersegi = persegi.hitungLuas();
        double lLingkaran1 = lingkaran1.hitungLuas();
        double lLingkaran2 = lingkaran2.hitungLuas();
        double lLingkaran3 = lingkaran3.hitungLuas();

        // Menghitung total luas bangun datar 
        double luasBangunDatarKompleks1 = lPersegi + (lLingkaran1 / 2 * 4);
        double luasBangunDatarKompleks2 = (lLingkaran2 / 2) - (2 * (lLingkaran3 / 2));

        // Menampilkan Hasil 
        System.out.println("Luas Bangun Datar 1    = " + luasBangunDatarKompleks1 + " cm2");
        System.out.println("Luas Bangun Datar 2    = " + luasBangunDatarKompleks2 + " cm2");
    }    
}
