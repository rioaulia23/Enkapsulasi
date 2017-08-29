/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latian.pkg2;

/**
 *
 * @author Rio Aulia Yahya
 */
public class Ujibus {
public static void main (String[] args){
    //membuat objek busMini dari kelas Bus
    Bus busMini = new Bus();
    //memasukan nilai jumlah penumpang dan penumpang maksimal ke
    //dalam objek busMini
    busMini.Penumpang = 5;
    busMini.maxPenumpang = 15;
    //memanggil method cetak pada kelas Bus
    busMini.cetak();
    
    //menambahkan penumpang pada busMini
    busMini.Penumpang = busMini.Penumpang + 5;
    //memanggil method cetak pada kelas Bus
    busMini.cetak();
    
    //mengurangi jumlah penumpang pada busMini
    busMini.Penumpang = busMini.Penumpang - 2;
    busMini.cetak();
    
    //menambahkan jumlah pennumpang pada busMini
    busMini.Penumpang = busMini.Penumpang + 5;
    busMini.cetak();
    }
}
