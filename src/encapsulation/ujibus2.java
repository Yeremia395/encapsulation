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
public class ujibus2 {
    public static void main(String[] args) {
        
    
    
    //membuat objek busBesar dari class bus2
    
    BUS2 busbesar = new BUS2(40);
    busbesar.cetak();
    
    //penambahan penumpang
    busbesar.addpenumpang(15);//menambahkan 15 penumpang
    busbesar.cetak();
    
     //penambahan penumpang
    busbesar.addpenumpang(5);//menambahkan 5 penumpang
    busbesar.cetak();
    
     //penambahan penumpang
    busbesar.addpenumpang(26);//menambahkan 26 penumpang
    busbesar.cetak();
        
    
    
    
    }
}
