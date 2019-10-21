/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Yeremia Rizky
 */
public class UjiBus {
    public static void main(String[] args){
        
        //membuat objek bus mini dari class lt1
        
        lt1 busmini = new lt1();
        
        //masukkan nilai jumlah penumpang dan max penumpang ke objek bus mini
        
        busmini.penumpang=5;
        busmini.maxpenumpang=15;
        
        //memanggil method cetak pada kelas bis
        
        busmini.cetak();
        
        //menambahkan jumlah penumpang pada bus mini
        
        busmini.penumpang = busmini.penumpang + 5;
      
        //memanggil method cetak pada kelas bus
        
        busmini.cetak();
        
        //menguranggi penumpang pada bus mini
        
        busmini.penumpang = busmini.penumpang - 2;
        busmini.cetak();
        
        //menambahkan jumlah penumpang pada bus mini
        
        busmini.penumpang = busmini.penumpang +8;
        busmini.cetak();
    }
    
}
