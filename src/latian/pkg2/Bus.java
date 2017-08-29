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
public class Bus {
    public int Penumpang;
    public int maxPenumpang;
    int penumpang;
    
    public void cetak(){
        System.out.println("Penumpang bis sekarang adalah" + Penumpang);
        System.out.println("Penumpang maksimal seharusnya adalah" + maxPenumpang);
    }
}
