/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latian_2;

/**
 *
 * @author Rio Aulia Yahya
 */
public class Ujibus {
    public static void main(String[] args){
        
        //membuat objek busBesar dari kelas bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15);//menambahkan 15 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5);//menambahkan 5 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26);//manembahkan 26 penumpang
        busBesar.cetak();
    }
    
}
