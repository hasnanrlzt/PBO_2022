/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author hasna.nrlzt
 */
public class Lingkaran {
     // atribut
    
    int jejari;
    
    // methods
    
    void hitungLuas(){
        int luas = (int) (3.14 * this.jejari * this.jejari);
        System.out.println("Luas: " + luas + " satuan luas");
    }
    
    void hitungKeliling(){
        int keliling = (int) (2 *  3.14 *  this.jejari);
        System.out.println("Keliling: " + keliling + " satuan panjang");
    }
}
