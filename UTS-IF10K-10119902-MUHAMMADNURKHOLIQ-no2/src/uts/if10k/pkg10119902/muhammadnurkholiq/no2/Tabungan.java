/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119902.muhammadnurkholiq.no2;

/**
 *
 * @author korik
 */
public class Tabungan {
    private final int saldo;
    
    public Tabungan (int saldo){
        this.saldo = saldo;
        
    }
    public int ambilUang(int jumlah){
        return saldo - jumlah;
    }
}
