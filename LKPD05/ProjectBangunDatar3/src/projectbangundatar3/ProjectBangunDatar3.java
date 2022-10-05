/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar3;

/**
 *
 * @author hasna.nrlzt
 */
public class ProjectBangunDatar3 {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LINGKARAN //
        System.out.println("-LINGKARAN 1-");
        Lingkaran l1 = new Lingkaran(10);
        l1.luas();
        l1.keliling();
        
        System.out.println("-LINGKARAN 2-");
        Lingkaran l2 = new Lingkaran(6.28);
        l2.luas();
        l2.keliling();
        
        // SEGITIGA //
        System.out.println("-LUAS SEGITIGA-");
        Segitiga s1 = new Segitiga(3, 4);
        s1.luas();
        
        Segitiga s2 = new Segitiga(4, 8.5);
        s2.luas();
        
        Segitiga s3 = new Segitiga(4.4, 10);
        s3.luas();
        
        Segitiga s4 = new Segitiga(14.2, 13.4);
        s4.luas();
        
        
        // PERSEGI PANJANG //
        System.out.println("-PERSEGI PANJANG 1-");
        PersegiPanjang pp1 = new PersegiPanjang(12, 6);
        pp1.luas();
        pp1.keliling();
        
        System.out.println("-PERSEGI PANJANG 2-");
        PersegiPanjang pp2 = new PersegiPanjang(4.4, 10);
        pp2.luas();
        pp2.keliling();
        
        System.out.println("-PERSEGI PANJANG 3-");
        PersegiPanjang pp3 = new PersegiPanjang(5, 12.5);
        pp3.luas();
        pp3.keliling();
        
        System.out.println("-PERSEGI PANJANG 4-");
        PersegiPanjang pp4 = new PersegiPanjang(7.6, 12.4);
        pp4.luas();
        pp4.keliling();
        
        // PERSEGI //
        System.out.println("-PERSEGI 1-");
        Persegi p1 = new Persegi(2.5);
        p1.luas();
        p1.keliling();
        
        System.out.println("-PERSEGI 2-");
        Persegi p2 = new Persegi(12);
        p2.luas();
        p2.keliling();
        
    }
}
