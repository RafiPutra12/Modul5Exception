/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;
import java.io.*;
/**
 *
 * @author M. RAFI PUTRA
 */
public class UjiWaktu extends WaktuSamaDengan{
    public UjiWaktu(int w, int v, int s) {
        super(w, v, s);
    }
    
    public static void main(String[] args) throws IOException {
        String uji;
        int v = 0, s = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        System.out.println("Masukkan kecapatan: ");
        uji = br.readLine();
        System.out.println("Masukkan Jarak: ");
        uji = br.readLine();
        try{
            s = Integer.parseInt(uji);
            System.out.println("Waktu = "+ v/s);
        }catch(NumberFormatException nfs) {
            System.out.println("Jarak tidak boleh 0");
            System.exit(1); 
        }
        System.out.println("Waktu = "+ v/s);
    }  
}
