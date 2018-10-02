/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author M. RAFI PUTRA
 */
public class WaktuSamaDengan {
    private int waktu;
    private int kecepatan;
    private int jarak;
    
    public WaktuSamaDengan(int w, int v, int s) {
        this.waktu = w;
        this.kecepatan = v;
        this.jarak = s;
    }

    public int getWaktu() {
       return waktu;
    }
    
    public int getKecepatan() {
       return kecepatan;
    }
    
    public int getJarak() {
       return jarak;
    }
}
