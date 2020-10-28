/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan19.saldotabungan;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program untuk menaampilkan Saldo Tabungan
 */
public class PBOIF210119051Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lama, bunga,saldo,saldoAwal, saldoAkhir;
        
        saldoAwal =2500000;
        bunga = 15;
        lama = 6;
        
        for (int i=1; i<=lama; i++){
            saldo = saldoAwal * bunga/100; 
            saldoAkhir = saldo + saldoAwal;
            System.out.println("Saldo di bulan ke-"+ i + " Rp."+saldoAkhir); 
            saldoAwal += saldo;
          
        }
               
        
    }
    
}
