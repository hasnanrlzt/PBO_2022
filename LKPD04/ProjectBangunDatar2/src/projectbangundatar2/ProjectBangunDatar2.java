/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author hasna.nrlzt
 */
public class ProjectBangunDatar2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PERSEGI PANJANG //
        System.out.println("-PERSEGI PANJANG-");
        PersegiPanjang PP = new PersegiPanjang();
        System.out.println("p. " + PP.luas(15, 10));
        System.out.println("x. " + PP.luas(20.5, 9));
        System.out.println("y. " + PP.luas(16, 7.5));
        System.out.println("z. " + PP.luas(25.3, 13.5));
    
        // PERSEGI //
        System.out.println("-PERSEGI-");
        Persegi P = new Persegi();
        System.out.println("x. " + P.luas(5.5));
        System.out.println("y. " + P.luas(10));
        
        // LINGKARAN //
        System.out.println("-LINGKARAN-");
        Lingkaran L = new Lingkaran();
        System.out.println("x. " + L.luas(7));
        System.out.println("y. " + L.luas(6.3));
        
        // SEGITIGA //
        System.out.println("-SEGITIGA-");
        Segitiga S = new Segitiga();
        System.out.println("p. " + S.luas(4, 5));
        System.out.println("x. " + S.luas(10, 12.5));
        System.out.println("y. " + S.luas(14.5, 8));
        System.out.println("z. " + S.luas(12.5, 22.8));
    }
    
}
